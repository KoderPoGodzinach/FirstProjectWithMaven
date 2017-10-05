package dao;

import java.sql.SQLException;

public interface DaoPerson {
    void showAll() throws Exception;

    void addNewPerson() throws SQLException;

    void addNewPerson2() throws SQLException;

    void findPersonByName(String name) throws Exception;

    void findPersonBySurname(String surname) throws Exception;

    void updatePerson() throws SQLException;
}
