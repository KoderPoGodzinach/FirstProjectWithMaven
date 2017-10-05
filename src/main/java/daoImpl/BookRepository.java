package daoImpl;

import dao.DaoBook;
import model.Book;
import model.DbConfiguration;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class BookRepository implements DaoBook {
    DbConfiguration dbConfiguration = new DbConfiguration();
    ResultSet resultSet;


    public static Connection connection = null;

    public void showAll() throws Exception {
        resultSet = dbConfiguration.dbExecuteQuery("Select * From book");

        while (resultSet.next()) {
            System.out.println("title: " + (resultSet.getString(2)) + " autor: " + (resultSet.getString(3)));
        }
    }


    public void addNewBook() throws Exception {
        dbConfiguration.dbExecuteUpdateQuery("INSERT INTO `library`.`book` (`idBook`, `title`, `autor`) VALUES ('8'," +
                " 'GOT', 'R.R.Martin')");
    }

    // czy update book może kożystać z tej samej metody ????????
    public void updateBook() throws SQLException {
        dbConfiguration.dbExecuteUpdateQuery("UPDATE `library`.`book` SET `idBook`='6', `title`='Piąty poziom', " +
                "`autor`='Volant' WHERE `idBook`='2'");
    }

    public void findBook(String title) throws Exception {
        resultSet = dbConfiguration.dbExecuteQuery("Select * From `library`.`book` Where title= " + "'"+title+"'" );
        while(resultSet.next()) {
            System.out.println("idBook: "+(resultSet.getString(1))+" Title: "+(resultSet.getString(2))+" autor: "+
                    (resultSet.getString(3)));
        }
    }


    // pomysł z książki
    public void addNewBook2() throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj id nowej książki");
        int id = scanner.nextInt();
        System.out.println("Podaj title nowej ksiazki");
        String title = scanner.next();
        System.out.println("Podaj autor nowej ksiazki");
        String autor = scanner.next();
        //Book = new Book(id, title, autor);

        try {
            PreparedStatement preparedStatement = connection.prepareStatement("Insert Into 'library'.'book' ('idBook','title','autor') Values(?,?,?)");
            preparedStatement.setString(1, String.valueOf(id));
            preparedStatement.setString(2, title);
            preparedStatement.setString(3, autor);

            preparedStatement.executeUpdate();
            preparedStatement.close();
            connection.close();
        } catch (Exception ex) {
            System.out.println("Wystapił błąd : " + ex.getMessage());
        }
    }

    public void addNewBook3(Book book) throws SQLException {
        String values = "INSERT Into `library`.`book` (`idBook`, `title`, `autor`) Values "+"("
                +book.getIdBook()+",'"+book.getTitle()+"',"+"'"+book.getAutor()+"')";
       // dbConfiguration.dbExecuteUpdateQuery("INSERT Into 'library'.'book' ('idBook','title','autor') Values"+"("
         //       +book.getIdBook()+",'"+book.getTitle()+"',"+"'"+book.getAutor()+"')");

     //  System.out.println("INSERT Into `library`.`book` (`idBook`, `title`, `autor`) Values "+"("
       //       +book.getIdBook()+",'"+book.getTitle()+"',"+""+book.getAutor()+")");

      //  System.out.println("INSERT INTO `library`.`book` (`idBook`, `title`, `autor`) VALUES ('14'," +
           //     " 'GOT', 'R.R.Martin')");

        dbConfiguration.dbExecuteUpdateQuery(values);
    }

}
