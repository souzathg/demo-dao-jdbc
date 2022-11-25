package br.com.souzathg.model.dao;

import br.com.souzathg.model.entities.Department;

import java.util.List;

public interface DepartmentDao {
    void insert(Department obj);
    void update(Department obj);
    void deleteById(Integer id);
    Department findById(Integer id);
    List<Department> findAll();

}
