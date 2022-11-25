package br.com.souzathg.application;

import br.com.souzathg.model.dao.DaoFactory;
import br.com.souzathg.model.dao.SellerDao;
import br.com.souzathg.model.entities.Department;
import br.com.souzathg.model.entities.Seller;

import java.util.Date;

public class Application {
    public static void main(String[] args) {
        Department obj = new Department(1, "Books");
        Seller seller = new Seller(21, "Bob", "bob@gmail.com", new Date(), 3000.00, obj);

        SellerDao sellerDao = DaoFactory.createSellerDao();

        System.out.println(seller);
    }
}