package controller;

import daoImpl.BookRepository;
import daoImpl.BorrowRepository;
import daoImpl.PersonRepository;

import java.sql.SQLException;
import java.util.Scanner;

public class MainMenu {
    BookRepository bookRepository = new BookRepository();
    PersonRepository personRepository = new PersonRepository();
    BorrowRepository borrowRepository = new BorrowRepository();


    public void run() throws Exception {
        menu();
        Scanner scanner = new Scanner(System.in);
        int variable;
        do {
            variable = scanner.nextInt();
            switch (variable) {
                case 1:
                    addBook();
                    menu();
                    break;
                case 2:
                    showAllBook();
                    menu();
                    break;
                case 3:
                    addPerson();
                    menu();
                    break;
                case 4:
                    showAllPerson();
                    menu();
                    break;
                case 5:
                    addBorrow();
                    menu();
                    break;
                case 6:
                    showAllBorrow();
                    menu();
                    break;
                case 7:
                    deleteBook();
                    menu();
                    break;
                case 8:
                    deletePerson();
                    menu();
                    break;
            }
        } while (!(variable == 9));
    }

    private void deletePerson() throws SQLException {
        personRepository.deletePerson();
    }

    private void deleteBook() throws SQLException {
        bookRepository.deleteBook();
    }

    private void showAllBorrow() throws Exception {
        borrowRepository.showAllBorrow();
    }

    private void addBorrow() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a neme");
        String name = scanner.next();
        System.out.println("Give a surname");
        String surname = scanner.next();
        System.out.println("Give title book");
        String title = scanner.next();
        try {
            borrowRepository.addBorrow(name, surname, title);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void showAllPerson() throws Exception {
        personRepository.showAll();
    }

    private void addPerson() throws SQLException {
        personRepository.addNewPerson2();
    }

    private void showAllBook() throws Exception {
        bookRepository.showAll();
    }

    private void addBook() throws Exception {
        bookRepository.addNewBook3();
    }

    private void menu() {
        System.out.println("1 - Add Book");
        System.out.println("2 - Show All Book in Library");
        System.out.println("3 - Add Person");
        System.out.println("4 - Show All Person in Library");
        System.out.println("5 - Add Borrow");
        System.out.println("6 - Show All Borrow");
        System.out.println("7 - If you delete Book");
        System.out.println("8 - If you delete Person");
        System.out.println("9 - Close");
    }
}
