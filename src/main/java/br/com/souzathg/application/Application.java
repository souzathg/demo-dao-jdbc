package br.com.souzathg.application;

import br.com.souzathg.model.dao.DaoFactory;
import br.com.souzathg.model.dao.SellerDao;
import br.com.souzathg.model.entities.Seller;

public class Application {
    public static void main(String[] args) {
        SellerDao sellerDao = DaoFactory.createSellerDao();

        Seller seller = sellerDao.findById(3);

        System.out.println(seller);
    }
}