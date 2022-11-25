package br.com.souzathg.application;

import br.com.souzathg.model.dao.DaoFactory;
import br.com.souzathg.model.dao.DepartmentDao;
import br.com.souzathg.model.entities.Department;

import java.util.List;

public class Application2 {
    public static void main(String[] args) {
        DepartmentDao depDao = DaoFactory.createDepartmentDao();

        System.out.println("==== Test 1: Find by Id ====");
        Department dep = depDao.findById(2);
        System.out.println(dep);

        System.out.println("==== Test 2: Find All ====");
        List<Department> list = depDao.findAll();
        for (Department newDep : list) {
            System.out.println(newDep);
        }

        System.out.println("==== Test 3: Insert ====");
        Department dep2 = new Department(null, "Music");
        depDao.insert(dep2);

        System.out.println("==== Test 4: Update ====");
        dep2.setName("Games");
        depDao.update(dep2);
        System.out.println("Updated!");

        System.out.println("==== Test 5: Delete by Id ====");
        depDao.deleteById(dep2.getId());
        System.out.println("Department deleted!");
    }
}
