import java.util.Scanner;

public class SearchValueInArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize the dataPoints array
        int[] dataPoints = { /* Your array values here */ };

        System.out.print("Enter a value between 1 and 100: ");
        int userValue = scanner.nextInt();

        boolean found = false;
        int position = -1;

        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] == userValue) {
                found = true;
                position = i;
                break;
            }
        }

        if (found) {
            System.out.println("The value " + userValue + " was found at array index " + position);
        } else {
            System.out.println("The value " + userValue + " was not found in the array.");
        }
    }
}
