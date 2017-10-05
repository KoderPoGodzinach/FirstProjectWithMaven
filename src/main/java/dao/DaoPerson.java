package dao;

import java.sql.SQLException;

public interface DaoPerson {
    void showAll() throws Exception;
    void addPerson() throws SQLException;
}
