import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int game = 0;
        while (game != 5) {
            System.out.println("Choose option:");
            System.out.println("1. Show all books");
            System.out.println("2. Add new book");
            System.out.println("3. Borrow a book");
            System.out.println("4. Return a book");
            System.out.println("5. Exit");
            System.out.print("Enter your option: ");
            int choice = Integer.parseInt(sc.nextLine());

            System.out.println(choice);

            switch (choice) {
                case 1:
                    System.out.println("Option 1 selected");
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
