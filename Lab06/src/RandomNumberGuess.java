import java.util.Random;
import java.util.Scanner;

public class RandomNumberGuess {
    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(10) + 1; // Generates a random number between 1 and 10

        Scanner scanner = new Scanner(System.in);

        System.out.print("Guess the number (between 1 and 10): ");
        if (scanner.hasNextInt()) {
            int userGuess = scanner.nextInt();

            System.out.println("Random number was: " + randomNumber);

            if (userGuess < 1 || userGuess > 10) {
                System.out.println("Your guess is out of range. Please guess a number between 1 and 10.");
            } else if (userGuess == randomNumber) {
                System.out.println("Congratulations! Your guess is correct.");
            } else if (userGuess < randomNumber) {
                System.out.println("Your guess is too low.");
            } else {
                System.out.println("Your guess is too high.");
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer between 1 and 10.");
        }

        scanner.close();
    }
}
