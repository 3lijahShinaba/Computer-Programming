import java.util.Random;

public class Lab_09_ArrayStuff {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        Random rnd = new Random();
        double sum = 0;

        // Part (b): Initialize dataPoints with random values between 1 and 100
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = rnd.nextInt(100) + 1;
        }

        // Part (c): Display the dataPoints values separated by " | "
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print(dataPoints[i]);
            if (i < dataPoints.length - 1) {
                System.out.print(" | ");
            }
        }
        System.out.println(); // Print a new line for readability

        // Part (d): Calculate the sum and average
        for (int value : dataPoints) {
            sum += value;
        }
        double average = sum / dataPoints.length;

        System.out.printf("The sum of the random array dataPoints is: %.2f%n", sum);
        System.out.printf("The average of the random array dataPoints is: %.2f%n", average);
    }
}

