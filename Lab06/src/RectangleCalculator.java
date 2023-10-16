import java.util.Scanner;

public class RectangleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first side of the rectangle: ");
        if (scanner.hasNextDouble()) {
            double length1 = scanner.nextDouble();

            System.out.print("Enter the length of the second side of the rectangle: ");
            if (scanner.hasNextDouble()) {
                double length2 = scanner.nextDouble();

                double area = length1 * length2;
                double perimeter = 2 * (length1 + length2);
                double diagonal = Math.sqrt(Math.pow(length1, 2) + Math.pow(length2, 2));

                System.out.println("Area of the rectangle: " + area);
                System.out.println("Perimeter of the rectangle: " + perimeter);
                System.out.println("Length of the diagonal: " + diagonal);
            } else {
                System.out.println("Invalid input for the second side. Please enter a valid number.");
            }
        } else {
            System.out.println("Invalid input for the first side. Please enter a valid number.");
        }

        scanner.close();
    }
}

