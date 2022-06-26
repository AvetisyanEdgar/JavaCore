package homework.books;

import java.util.Scanner;

public class AuthorBookDemo implements BookCommands {
    //Declaring Objects
    // final է դրած intellij-ի խորհուրդով )
    private final static BookStorage bookStorage = new BookStorage();
    private final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        // Adding some books for test
        bookStorage.add(new Book("Romeo and Juliet", "Shakespeare", 20.5, 2, "classical"));
        bookStorage.add(new Book("Java", "Herbert Shield", 15.0, 4, "technical"));
        bookStorage.add(new Book("IT", "Stephen King", 30, 1, "horror"));
        bookStorage.add(new Book("Apocalypse 3", "Max Maxim", 20, 2, "fantasy"));
        //The main logic
        boolean runAble = true;
        while (runAble) {
            System.out.println("Input " + EXIT + " to exit the Program");
            System.out.println("Input " + ADD_BOOK + " to add a book");
            System.out.println("Input " + PRINT_ALL_BOOKS + " to print all books");
            System.out.println("Input " + PRINT_BOOKS_BY_AUTHOR_NAME + " to print author's all books");
            System.out.println("Input " + PRINT_BOOK_BY_GENRE + " to print books with the same genre");
            System.out.println("Input " + PRINT_BOOKS_BY_PRICE_RANGE + " to sort the books by their price");
            int command = Integer.parseInt(scanner.nextLine());
            switch (command) {
                case EXIT:
                    runAble = false;
                    System.out.println("GoodBye!");
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
            }
        }
    }

    private static void PrintBooksByPriceRange() {
        System.out.println("Input the lowest price");
        double lowestPrice = Double.parseDouble(scanner.nextLine());
        System.out.println("Input the highest price");
        double highestPrice = Double.parseDouble(scanner.nextLine());
        bookStorage.PrintBooksByPriceRange(lowestPrice, highestPrice);
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


    private static void addBook() {
        System.out.println("Input Book's Title");
        String title = scanner.nextLine();
        System.out.println("Input Book's Author");
        String authorName = scanner.nextLine();
        System.out.println("Input Book's price");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Input Book's count");
        int count = Integer.parseInt(scanner.nextLine());
        System.out.println("Input Book's genre");
        String genre = scanner.nextLine();
        Book book = new Book(title, authorName, price, count, genre);
        bookStorage.add(book);
        System.out.println("The Book has been saved successfully!");
    }
}
