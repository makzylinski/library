import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    private static Integer readUserChoice(Scanner sc, String message) {
        System.out.println(message);

        try {
            return Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please input numeric value");
            return null;
        }
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int game = 0;
        Library library = new Library();

        List<Book> books = new ArrayList<>();
        List<Book> borrowedBooks = new ArrayList<>();

        books.add(new Book("1984", new Author("George Orwell"), 215, 0));
        books.add(new Book("To Kill a Mockingbird", new Author("Harper Lee"), 142, 1));
//        books.add(new Book("The Great Gatsby", new Author("F. Scott Fitzgerald"), 425, 2));
//        books.add(new Book("Brave New World", new Author("Aldous Huxley"), 41, 3));
//        books.add(new Book("Pride and Prejudice", new Author("Jane Austen"), 332, 4));
//        books.add(new Book("The Catcher in the Rye", new Author("J.D. Salinger"), 215, 5));
//        books.add(new Book("Moby-Dick", new Author("Herman Melville"), 71, 6));
//        books.add(new Book("The Hobbit", new Author("J.R.R. Tolkien"), 126, 7));
//        books.add(new Book("Fahrenheit 451", new Author("Ray Bradbury"), 512, 8));
//        books.add(new Book("Crime and Punishment", new Author("Fyodor Dostoevsky"), 442, 9));

        library.setBooks(books);

        while (game != 5) {
            System.out.println("Choose option:");
            System.out.println("1. Show all books");
            System.out.println("2. Add new book");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter your option: ");


            Integer choice = readUserChoice(sc, "Enter your option: ");
            if (choice == null) continue;

            switch (choice) {
                case 1:
                    System.out.println("Option 1 selected");
                    for (Book b : library.getBooks()) {
                        System.out.println(b);
                    }
                    break;
                case 2:
                    System.out.println("Option 2 selected");
                    System.out.println("Input book title");
                    String titleChoice = sc.nextLine();

                    System.out.println("Input author name and last name");
                    String authorChoice = sc.nextLine();

                    System.out.println("Input pages");
                    int pagesChoice = Integer.parseInt(sc.nextLine());

                    books.add(new Book(titleChoice, new Author(authorChoice), pagesChoice, library.getBooks().size()));
                    library.setBooks(books);
                    break;
                case 3:
                    for (Book b : library.getBooks()) {
                        System.out.println(b);
                    }
                    Integer bookIdChoice = readUserChoice(sc, "Which book would you like to borrow? Input ID: ");
                    if (bookIdChoice == null) break;
                    AtomicInteger bookIndex = new AtomicInteger();
                    books.forEach(book -> {
                        if (book.getId() == bookIdChoice) {
                            bookIndex.set(books.indexOf(book));
                            borrowedBooks.add(books.get(bookIndex.get()));
                            System.out.println(borrowedBooks);
                        }
                    });
                    books.remove(bookIndex.get());
                    break;
                case 4:
                    System.out.println("Option 4 selected");
                    break;
                case 5:
                    System.out.println("Option 5 selected");
                    game = 5;
                    break;
                }

        }
    }
}
