package br.com.souzathg.application;

import br.com.souzathg.model.dao.DaoFactory;
import br.com.souzathg.model.dao.SellerDao;
import br.com.souzathg.model.entities.Department;
import br.com.souzathg.model.entities.Seller;

import java.util.Date;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println("==== Test 1: Seller Test findById ====");
        Seller seller = sellerDao.findById(3);
        System.out.println(seller);

        System.out.println("\n==== Test 2: Seller findByDepartment ====");
        Department department = new Department(2, null);
        List<Seller> list = sellerDao.findByDepartment(department);

        for (Seller obj : list) {
            System.out.println(obj);
        }

        System.out.println("\n==== Test 3: Seller findAll ====");
        List<Seller> listAll = sellerDao.findAll();

        for (Seller obj : listAll) {
            System.out.println(obj);
        }

        System.out.println("\n==== Test 4: Seller Insert ====");
        Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", new Date(), 4000.00, department);
        sellerDao.insert(newSeller);
        System.out.println("Inserted! New ID = " + newSeller.getId());

        System.out.println("\n==== Test 5: Seller Update ====");
        seller = sellerDao.findById(1);
        seller.setName("Martha Waine");
        sellerDao.update(seller);
        System.out.println("Update completed!");
    }
}