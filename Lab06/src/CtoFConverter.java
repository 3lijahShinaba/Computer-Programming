import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {

        System.out.print("Enter temperature in degrees Celsius: ");
        Scanner scanner = new Scanner(System.in);

       do{
            System.out.println("Invalid input. Please enter a valid number.");
            System.out.print("Enter temperature in degrees Celsius: ");
            scanner = new Scanner(System.in);
        } while (!scanner.hasNextDouble());

       if (scanner.hasNextDouble()) {
               double celsius = scanner.nextDouble();
               double fahrenheit = (celsius * 9 / 5) + 32;

               System.out.println("Equivalent temperature in degrees Fahrenheit: " + fahrenheit);

               // Check for freezing and boiling points
               if (celsius == 0) {
                   System.out.println("This is the freezing point of water.");
               } else if (celsius == 100) {
                   System.out.println("This is the boiling point of water.");
               }
           } else {
               System.out.println("Invalid input. Please enter a valid number.");
           }
       }
        //scanner.close();
    }

