import java.util.ArrayList;
import java.util.Scanner;

public class ListMaker {
    private static ArrayList<String> myArrList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        char choice;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = getValidInput("[AaDdPpQq]");

            switch (choice) {
                case 'A':
                    addItem();
                    break;
                case 'D':
                    deleteItem();
                    break;
                case 'P':
                    displayList();
                    break;
                case 'Q':
                    if (confirmQuit()) {
                        System.out.println("Exiting program. Goodbye!");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (true);
    }

    private static void displayMenu() {
        System.out.println("\nMenu Options:");
        System.out.println("A - Add an item to the list");
        System.out.println("D - Delete an item from the list");
        System.out.println("P - Print the list");
        System.out.println("Q - Quit");
    }

    private static void addItem() {
        System.out.print("Enter the item to add: ");
        String newItem = scanner.nextLine();
        myArrList.add(newItem);
        System.out.println("Item added successfully.");
    }

    private static void deleteItem() {
        if (myArrList.isEmpty()) {
            System.out.println("The list is empty. Nothing to delete.");
            return;
        }

        displayNumberedItemList();
        int itemNumber = getValidInt("Enter the item number to delete: ", 1, myArrList.size());
        String deletedItem = myArrList.remove(itemNumber - 1);
        System.out.println("Item '" + deletedItem + "' deleted successfully.");
    }

    private static void displayList() {
        if (myArrList.isEmpty()) {
            System.out.println("The list is empty.");
        } else {
            System.out.println("Current List:");
            for (String item : myArrList) {
                System.out.println("- " + item);
            }
        }
    }

    private static void displayNumberedItemList() {
        System.out.println("Numbered List:");
        for (int i = 0; i < myArrList.size(); i++) {
            System.out.println((i + 1) + ". " + myArrList.get(i));
        }
    }

    private static boolean confirmQuit() {
        return getYNConfirm("Are you sure you want to quit? (Y/N): ");
    }

    private static char getValidInput(String pattern) {
        char input;
        do {
            System.out.print("Enter a valid choice: ");
            input = scanner.nextLine().toUpperCase().charAt(0);
        } while (!String.valueOf(input).matches(pattern));
        return input;
    }

    private static int getValidInt(String prompt, int min, int max) {
        int input;
        do {
            System.out.print(prompt);
            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next();
            }
            input = scanner.nextInt();
        } while (input < min || input > max);
        scanner.nextLine(); // Consume the newline character
        return input;
    }

    private static boolean getYNConfirm(String prompt) {
        String input;
        do {
            System.out.print(prompt);
            input = scanner.nextLine().toUpperCase();
        } while (!input.equals("Y") && !input.equals("N"));
        return input.equals("Y");
    }
}

