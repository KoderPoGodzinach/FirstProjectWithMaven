package daoImpl;

import dao.DaoBorrow;
import model.DbConfiguration;

import java.sql.ResultSet;

public class BorrowRepository implements DaoBorrow {
    DbConfiguration dbConfiguration = new DbConfiguration();
    ResultSet resultSet;

    public void addBorrow() {
    }

    public void showAllBorrow() throws Exception {
        resultSet = dbConfiguration.dbExecuteQuery("Select * From borrow");
        while(resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
    }
}
