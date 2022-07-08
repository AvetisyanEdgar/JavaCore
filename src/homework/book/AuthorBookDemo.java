package homework.book;

import homework.book.command.BookCommands;
import homework.book.storage.AuthorNotFoundException;
import homework.book.storage.AuthorStorage;
import homework.book.storage.BookStorage;
import homework.book.model.Book;
import homework.book.model.Author;

import java.util.Scanner;

public class AuthorBookDemo implements BookCommands {
    //Declaring Objects
    // final է դրած intellij-ի խորհուրդով
    private final static BookStorage bookStorage = new BookStorage();
    private final static Scanner scanner = new Scanner(System.in);
    private final static AuthorStorage authorStorage = new AuthorStorage();

    public static void main(String[] args) throws AuthorNotFoundException {
        //Adding some Authors for test
        Author Stephen = new Author("Stephen", "King", "StephenKing@gmail.com", "MALE");
        AuthorStorage.add(Stephen);
        Author Shield = new Author("Herbert", "Shield", "HerbertSield@gmail.com", "MALE");
        AuthorStorage.add(Shield);
        Author Shakespeare = new Author("Shakespeare", "", "Shakespeare@gmail.com", "MALE");
        AuthorStorage.add(Shakespeare);
        Author Maxim = new Author("Maxim", "Maxim", "MaxMaximov@mail.ru", "MALE");
        AuthorStorage.add(Maxim);
        // Adding some books for test
        bookStorage.add(new Book("Romeo and Juliet", Shakespeare, 20.5, 2, "classical"));
        bookStorage.add(new Book("Java", Shield, 15.0, 4, "technical"));
        bookStorage.add(new Book("IT", Stephen, 30, 1, "horror"));
        bookStorage.add(new Book("Apocalypse 3", Maxim, 20, 2, "fantasy"));
        //The main logic
        String login = "admin";
        boolean runAble = false;
        int password = 123456;
        while (!runAble) {
            System.out.println("\u001B[34m" + "Input your login to start");
            String InputLogin = scanner.nextLine().trim();
            System.out.println("Input your password" + "\u001B[0m");
            try {
                int InputPassword = Integer.parseInt(scanner.nextLine().trim());
                runAble = (login.equals(InputLogin) && password == InputPassword);
            } catch (IllegalArgumentException e) {
                System.err.println("The password need to contain numbers only!");
            }
            if (!runAble) {
                System.err.println("Incorrect login or password, please try again");

            }
        }
        while (runAble) {
            printCommands();
            try {
                int command = Integer.parseInt(scanner.nextLine().trim());
                int index;
                switch (command) {
                    case EXIT:
                        runAble = false;
                        System.out.println("\u001B[33m" + "GoodBye!");
                        break;
                    case ADD_BOOK:
                        addBook();
                        break;
                    case PRINT_ALL_BOOKS:
                        bookStorage.printAllBooks();
                        break;
                    case PRINT_BOOKS_BY_AUTHOR_NAME:
                        printBooksByAuthorName();
                        break;
                    case PRINT_BOOK_BY_GENRE:
                        printBookByGenre();
                        break;
                    case PRINT_BOOKS_BY_PRICE_RANGE:
                        PrintBooksByPriceRange();
                        break;
                    case ADD_AUTHOR:
                        addAuthor();
                        break;
                    case PRINT_ALL_AUTHORS:
                        authorStorage.printAuthors();
                        break;
                    case DELETE_AUTHOR_BY_INDEX:
                        authorStorage.printAuthors();
                        System.out.println("Input Author's Index");
                        index = Integer.parseInt(scanner.nextLine());
                        authorStorage.deleteAuthorByIndex(index);
                        break;
                    case PRINT_AUTHOR_BY_INDEX:
                        System.out.println("Input Author's index");
                        try {
                            index = Integer.parseInt(scanner.nextLine());
                            System.out.println(authorStorage.getAuthorByIndex(index));
                        } catch (AuthorNotFoundException e) {
                            System.out.println(e.getMessage());
                            System.out.println();
                        } catch (IllegalArgumentException e) {
                            System.out.println("Can't do this function " + e.getMessage());
                        }
                        break;
                    default:
                        System.err.println("Command with index " + command +" does not exist!" );
                        break;
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Input Number!");
            }
        }

    }

    private static void addAuthor() {
        System.out.println("Input Author's name");
        String name = scanner.nextLine();
        System.out.println("Input Author's surname");
        String surname = scanner.nextLine();
        System.out.println("Input Author's email");
        String email = scanner.nextLine();
        System.out.println("Input Author's gender");
        String gender = scanner.nextLine();
        Author author = new Author(name, surname, email, gender);
        AuthorStorage.add(author);
        System.out.println("The Author has been created");
    }

    private static void PrintBooksByPriceRange() {
        try {
            System.out.println("Input the lowest price");
            double lowestPrice = Double.parseDouble(scanner.nextLine());
            System.out.println("Input the highest price");
            double highestPrice = Double.parseDouble(scanner.nextLine());
            bookStorage.PrintBooksByPriceRange(lowestPrice, highestPrice);
        } catch (IllegalArgumentException e) {
            System.err.println("Input numbers only!");
        }
    }

    private static void printBookByGenre() {
        System.out.println("Input the Genre");
        String genre = scanner.nextLine();
        bookStorage.printBooksByGenre(genre.trim());
    }

    private static void printBooksByAuthorName() {
        System.out.println("Input Author's Name");
        String authorName = scanner.nextLine();
        bookStorage.printBooksByAuthorName(authorName.trim());
    }

    private static void addBook() throws AuthorNotFoundException {
        try {
            System.out.println("Input Book's Title");
            String title = scanner.nextLine();
            System.out.println("Input Book's Author's Index");
            int index = Integer.parseInt(scanner.nextLine());
            System.out.println("Input Book's price");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Input Book's count");
            int count = Integer.parseInt(scanner.nextLine());
            System.out.println("Input Book's genre");
            String genre = scanner.nextLine();
            Book book = new Book(title, authorStorage.getAuthorByIndex(index), price, count, genre);
            bookStorage.add(book);
            System.out.println("The Book has been saved successfully!");
        } catch (IllegalArgumentException e) {
            System.out.println("Input numbers only");
        }
    }

    private static void printCommands() {
        System.out.println("\u001B[35m" + "Input " + EXIT + " to exit the Program");
        System.out.println("Input " + ADD_BOOK + " to add a book");
        System.out.println("Input " + PRINT_ALL_BOOKS + " to print all books");
        System.out.println("Input " + PRINT_BOOKS_BY_AUTHOR_NAME + " to print author's all books");
        System.out.println("Input " + PRINT_BOOK_BY_GENRE + " to print books with the same genre");
        System.out.println("Input " + PRINT_BOOKS_BY_PRICE_RANGE + " to sort the books by their price");
        System.out.println("Input " + ADD_AUTHOR + " to add new Author");
        System.out.println("Input " + PRINT_ALL_AUTHORS + " to print all Authors");
        System.out.println("Input " + DELETE_AUTHOR_BY_INDEX + " to delete author");
        System.out.println("Input " + PRINT_AUTHOR_BY_INDEX + " to print an Author by index" + "\u001B[0m");
    }
}