package dao;

import model.Person;

public interface DaoBorrow {
    //ponieważ jak było addBorrow(Person person, String bookTitle) to wywalało błąd w tej metodzie.
    void addBorrow(String name,String surname, String bookTitle) throws Exception;

    void showAllBorrow() throws Exception;
}
