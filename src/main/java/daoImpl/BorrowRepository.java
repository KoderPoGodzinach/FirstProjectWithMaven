package daoImpl;

import dao.DaoBorrow;
import model.Book;
import model.DbConfiguration;

import java.sql.ResultSet;

public class BorrowRepository implements DaoBorrow {
    DbConfiguration dbConfiguration = new DbConfiguration();
    ResultSet resultSet;
    PersonRepository personRepository = new PersonRepository();
    BookRepository bookRepository = new BookRepository();

   // Book book;

    public void addBorrow(String name, String surname, String bookTitle) throws Exception {
        int idperson = personRepository.findPerson(name, surname);
        int idBook = bookRepository.findBook(bookTitle);
        int id = 11;

//        book.setIdBook(idBook);
//        if (book.getAvaiable() == false) {
  //          System.out.println("Przykro mi nie możesz wyporzyczyć tej książki ");
    //    } else {
            dbConfiguration.dbExecuteUpdateQuery("INSERT INTO `library`.`borrow` (`idborrow`, `idbook`, `idperson`) " +
                    "Values " + "(" + "'" + id + "'" + ",'" + idBook + "'," + "'" + idperson + "')");
      //      book.setIdBook(idBook);
        //    book.setAvaiable(false);
        //}
    }

    public void addBorrow(String surname, String bookTitle) throws Exception {
        int idperson = personRepository.findPerson(surname);
        int idBook = bookRepository.findBook(bookTitle);
        int id = 4;
        dbConfiguration.dbExecuteUpdateQuery("INSERT INTO `library`.`borrow` (`idborrow`, `idbook`, `idperson`) " +
                "Values " + "(" + "'" + id + "'" + ",'" + idBook + "'," + "'" + idperson + "')");
    }

    // Displaying information in rows in the table
    public void showAllBorrow() throws Exception {
        resultSet = dbConfiguration.dbExecuteQuery("Select * From borrow");
        while (resultSet.next()) {
            System.out.println(resultSet.getString(1));
        }
    }
}