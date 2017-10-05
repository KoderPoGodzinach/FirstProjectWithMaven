import daoImpl.BookRepository;
import daoImpl.PersonRepository;

public class FirstDb {
    public static void main(String[] args) throws Exception {

        BookRepository bookRepository = new BookRepository();
        PersonRepository personRepository = new PersonRepository();

        bookRepository.showAll();
        personRepository.showAll();
    }
}
