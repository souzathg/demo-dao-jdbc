package br.com.souzathg.model.dao;

import br.com.souzathg.db.DB;
import br.com.souzathg.model.dao.impl.SellerDaoJDBC;

public class DaoFactory {
    public static SellerDao createSellerDao() {
        return new SellerDaoJDBC(DB.getConnection());
    }
}
