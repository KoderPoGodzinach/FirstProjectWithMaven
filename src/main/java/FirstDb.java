import daoImpl.BookRepository;
import daoImpl.PersonRepository;
import model.Book;


public class FirstDb {
    public static void main(String[] args) throws Exception {

        // stworzenie obiektu bookRepository aby móc odwoływać się do ich metod
        BookRepository bookRepository = new BookRepository();

        // stworzenie obiektu personRepository aby móc odwoływać się do jego metod
        PersonRepository personRepository = new PersonRepository();

        // bookRepository.addNewBook();
        //bookRepository.showAll();
      // bookRepository.updateBook();
       // bookRepository.showAll();

       // bookRepository.addNewBook2();

  //      Book book = new Book(18,"Got","RRMartin");

//        bookRepository.addNewBook3(book);

        bookRepository.findBook("GOT");



       // bookRepository.addNewBook();
       // bookRepository.showAll();
       // personRepository.addPerson();
        //System.out.println("-------------------------------------");
       // personRepository.showAll();




        //        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","rd3290");
//            Statement statement = connection.createStatement();
//            //String insert = "Insert Into new_table Values (12,'tekst', 'kolejny tekst')";
//           // String kolejnyInsert = "Insert Into new_table Values(13,'kolejny napis', 'jeszcze jeden napis')";
//            //statement.executeUpdate(insert);
//            //statement.executeUpdate(kolejnyInsert);
//            ResultSet resultSet = statement.executeQuery("Select * From new_table");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("title"));
//               // System.out.println(resultSet.getString("text"));
//            }
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
    }
}
