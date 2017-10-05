package daoImpl;

import dao.DaoBook;
import model.Book;
import model.DbConfiguration;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class BookRepository implements DaoBook {
    DbConfiguration dbConfiguration = new DbConfiguration();
    ResultSet resultSet;

    // Displaying information in rows in the table
    public void showAll() throws Exception {
        resultSet = dbConfiguration.dbExecuteQuery("Select * From book");

        while (resultSet.next()) {
            System.out.println("title: " + (resultSet.getString(2)) + " autor: " + (resultSet.getString(3)));
        }
    }

    // adding a book to the library
    public void addNewBook() throws Exception {
        dbConfiguration.dbExecuteUpdateQuery("INSERT INTO `library`.`book` (`idBook`, `title`, `autor`) VALUES ('8'," +
                " 'GOT', 'R.R.Martin')");
    }

    // adding a book to the library
    public void addNewBook2(Book book) throws SQLException {
        dbConfiguration.dbExecuteUpdateQuery("INSERT Into `library`.`book` (`idBook`, `title`, `autor`) Values " + "("
                + book.getIdBook() + ",'" + book.getTitle() + "'," + "'" + book.getAutor() + "')");
    }

    // adding a book to the library
    public void addNewBook3() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Id the new book");
        int id = scanner.nextInt();
        System.out.println("Title the new book");
        String title = scanner.next();
        System.out.println("Autor the new book");
        String autor = scanner.next();

        dbConfiguration.dbExecuteUpdateQuery("INSERT Into `library`.`book` (`idBook`, `title`, `autor`) Values "+"("
                +id+",'"+title+"',"+"'"+autor+"')");
    }

    // Find a book by title
    public void findBookByTitle(String title) throws Exception {
        resultSet = dbConfiguration.dbExecuteQuery("Select * From `library`.`book` Where title= " + "'" + title + "'");
        while (resultSet.next()) {
            System.out.println("idBook: " + (resultSet.getString(1)) + " Title: " + (resultSet.getString(2)) + " autor: " +
                    (resultSet.getString(3)));
        }
    }

    // Find a book by autor
    public void findBookByAutor(String autor) throws Exception {
        resultSet = dbConfiguration.dbExecuteQuery("Select * From `library`.`book` Where title= " + "'" + autor + "'");
        while (resultSet.next()) { // dopoki istnieje kolejny obiekt wykonuj następujące działania:
            System.out.println("idBook: " + (resultSet.getString(1)) + " title" + (resultSet.getString(2)) + " autor" +
                    (resultSet.getString(3)));
        }
    }

    // Update book
    public void updateBook() throws SQLException {
        dbConfiguration.dbExecuteUpdateQuery("UPDATE `library`.`book` SET `idBook`='6', `title`='Piąty poziom', " +
                "`autor`='Volant' WHERE `idBook`='2'");
    }
}
