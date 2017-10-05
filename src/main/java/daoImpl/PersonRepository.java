package daoImpl;

import dao.DaoPerson;
import model.DbConfiguration;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class PersonRepository implements DaoPerson {
    DbConfiguration dbConfiguration = new DbConfiguration();
    ResultSet resultSet;

    // Displaying information in rows in the table
    public void showAll() throws Exception {
        resultSet = dbConfiguration.dbExecuteQuery("Select * From person");

        while (resultSet.next()) {
            System.out.println("Name: " + (resultSet.getString(2)) + " surname: " + resultSet.getString(3));
        }
    }
    // adding a person to the library
    public void addNewPerson() throws SQLException {
        dbConfiguration.dbExecuteUpdateQuery("INSERT INTO `library`.`person` (`idPerson`, `name`, `surname`)" +
                " VALUES " + "('3'," + " 'Adam', 'Kowalski')");
    }
    // adding a person to the library
    public void addNewPerson2() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give id");
        int id = scanner.nextInt();
        System.out.println("Give name");
        String name = scanner.next();
        System.out.println("Give surname");
        String surname = scanner.next();

        dbConfiguration.dbExecuteUpdateQuery("INSERT INTO `library`.`person` (`idPerson`, `name`, `surname`) Values " + "("
                + id + ",'" + name + "'," + "'" + surname + "')");

    }
    // Find a person by Name
    public void findPersonByName(String name) throws Exception {
        resultSet = dbConfiguration.dbExecuteQuery("Select * From `library`.`book` Where title= " + "'" + name + "'");
        while (resultSet.next()) {
            System.out.println("Id: " + (resultSet.getString(1) + " Name: " + (resultSet.getString(2)) + " Surname: " +
                    (resultSet.getString(3))));
        }
    }
    // Find Person by Surname
    public void findPersonBySurname(String surname) throws Exception {
        resultSet = dbConfiguration.dbExecuteQuery("Select * From `library`.`book` Where title= " + "'" + surname + "'");
        while (resultSet.next()) {
            System.out.println("Id: " + (resultSet.getString(1) + " Name: " + (resultSet.getString(2)) + " Surname: " +
                    (resultSet.getString(3))));
        }
    }
    // Update information about Person
    public void updatePerson() throws SQLException {
        dbConfiguration.dbExecuteUpdateQuery("UPDATE `library`.`person` SET `idPerson`='6', `name`='Eugeniusz', " +
                "`surname`='Kowalski' WHERE `idPerson`='2'");
    }
}
