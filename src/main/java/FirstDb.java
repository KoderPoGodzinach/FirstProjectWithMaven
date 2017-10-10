import daoImpl.BookRepository;
import daoImpl.BorrowRepository;
import daoImpl.PersonRepository;
import model.Person;

public class FirstDb {
    public static void main(String[] args) throws Exception {

        BookRepository bookRepository = new BookRepository();
        PersonRepository personRepository = new PersonRepository();
        BorrowRepository borrowRepository = new BorrowRepository();


        bookRepository.showAll();
        personRepository.showAll();
       // personRepository.findPerson("Rafał","Dziedzic");
       // borrowRepository.addBorrow(person,"Got");
       // borrowRepository.addBorrow("Dziedzic","Got");
       // borrowRepository.addBorrow("Rafał","Dziedzic","Mafia");
        borrowRepository.showAllBorrow();
    }

}
