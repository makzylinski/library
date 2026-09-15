import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int game = 0;
        Library library = new Library();

        List<Book> books = new ArrayList<>();

        for (int b = 0; b <= 10; b++) {
            books.add(new Book("1984", new Author("George Orwell"), 215, b));
            books.add(new Book("To Kill a Mockingbird", new Author("Harper Lee"), 142, b));
            books.add(new Book("The Great Gatsby", new Author("F. Scott Fitzgerald"), 425, b));
            books.add(new Book("Brave New World", new Author("Aldous Huxley"), 41, b));
            books.add(new Book("Pride and Prejudice", new Author("Jane Austen"), 332, b));
            books.add(new Book("The Catcher in the Rye", new Author("J.D. Salinger"), 215, b));
            books.add(new Book("Moby-Dick", new Author("Herman Melville"), 71, b));
            books.add(new Book("The Hobbit", new Author("J.R.R. Tolkien"), 126, b));
            books.add(new Book("Fahrenheit 451", new Author("Ray Bradbury"), 512, b));
            books.add(new Book("Crime and Punishment", new Author("Fyodor Dostoevsky"), 442, b));
        };

        library.setBooks(books);

        while (game != 5) {
            System.out.println("Choose option:");
            System.out.println("1. Show all books");
            System.out.println("2. Add new book");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter your option: ");
            int choice = Integer.parseInt(sc.nextLine());

            switch (choice) {
                case 1:
                    System.out.println("Option 1 selected");
                    System.out.println(library.getBooks());
                    break;
                case 2:
                    System.out.println("Option 2 selected");
                    break;
                case 3:
                    System.out.println("Option 3 selected");
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
