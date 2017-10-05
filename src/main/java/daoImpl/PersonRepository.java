package daoImpl;

import dao.DaoPerson;
import model.DbConfiguration;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PersonRepository implements DaoPerson {
    DbConfiguration dbConfiguration = new DbConfiguration();
    ResultSet resultSet;

    public void showAll() throws Exception {
        resultSet = dbConfiguration.dbExecuteQuery("Select * From person");

        while (resultSet.next()) {
            System.out.println("Name: " + (resultSet.getString(2))+ " surname: "+ resultSet.getString(3));
        }
    }

    public void addPerson() throws SQLException {
        dbConfiguration.dbExecuteUpdateQuery("INSERT INTO `library`.`person` (`idPerson`, `name`, `surname`)" +
                " VALUES " + "('3'," + " 'Adam', 'Kowalski')");
    }
}
