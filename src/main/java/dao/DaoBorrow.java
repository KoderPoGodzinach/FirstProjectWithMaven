package dao;


public interface DaoBorrow {
    void addBorrow(String name, String surname, String bookTitle) throws Exception;

    void showAllBorrow() throws Exception;

}
