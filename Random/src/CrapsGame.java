import java.util.Random;
import java.util.Scanner;

public class CrapsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean continuePlaying = true;

        while (continuePlaying) {
            int dice1 = rollDice(random);
            int dice2 = rollDice(random);
            int sum = dice1 + dice2;

            System.out.println("Rolling the dice...");
            System.out.println("Die 1: " + dice1);
            System.out.println("Die 2: " + dice2);
            System.out.println("Sum: " + sum);

            if (sum == 2 || sum == 3 || sum == 12) {
                System.out.println("You crapped out! You lose.");
            } else if (sum == 7 || sum == 11) {
                System.out.println("You won with a natural!");
            } else {
                System.out.println("The point is now " + sum);
                boolean continueRolling = true;
                while (continueRolling) {
                    int nextRoll = rollDice(random);
                    System.out.println("Rolling the dice again...");
                    System.out.println("Die 1: " + dice1);
                    System.out.println("Die 2: " + dice2);
                    System.out.println("Sum: " + nextRoll);

                    if (nextRoll == sum) {
                        System.out.println("You made the point and won!");
                        continueRolling = false;
                    } else if (nextRoll == 7) {
                        System.out.println("You got a seven and lost.");
                        continueRolling = false;
                    } else {
                        System.out.println("Trying for the point...");
                    }
                }
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgain = scanner.next();
            continuePlaying = playAgain.equalsIgnoreCase("yes");
        }

        System.out.println("Thanks for playing!");
    }

    private static int rollDice(Random random) {
        return random.nextInt(6) + 1;
    }
  }
