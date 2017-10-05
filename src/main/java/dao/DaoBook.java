package dao;


import model.Book;

import java.sql.SQLException;

public interface DaoBook {
    void showAll() throws Exception;

    void addNewBook() throws Exception;

    void addNewBook2() throws SQLException;
    void addNewBook3(Book book) throws SQLException;

    void updateBook() throws SQLException;

    void findBook(String title) throws Exception;
}
