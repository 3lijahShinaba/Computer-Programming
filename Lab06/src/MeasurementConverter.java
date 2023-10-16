import java.util.Scanner;

public class MeasurementConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a measurement in meters: ");
        if (scanner.hasNextDouble()) {
            double meters = scanner.nextDouble();

            // Conversion factors
            double metersToMiles = 0.000621371;
            double metersToFeet = 3.28084;
            double metersToInches = 39.3701;

            double miles = meters * metersToMiles;
            double feet = meters * metersToFeet;
            double inches = meters * metersToInches;

            System.out.println("Measurement in miles: " + miles);
            System.out.println("Measurement in feet: " + feet);
            System.out.println("Measurement in inches: " + inches);
        } else {
            System.out.println("Invalid input for measurement in meters. Please enter a valid number.");
        }

        scanner.close();
    }
}
