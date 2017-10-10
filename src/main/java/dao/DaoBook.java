package dao;

import model.Book;

import java.sql.SQLException;

public interface DaoBook {
    void showAll() throws Exception;

    void addNewBook() throws Exception;

    void addNewBook2(Book book) throws SQLException;

    void addNewBook3() throws SQLException;

    void findBookByTitle(String title) throws Exception;

    int findBook(String title) throws Exception;

    void findBookByAutor(String autor) throws Exception;

    void updateBook() throws SQLException;
}
