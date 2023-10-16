public class Task06 {
    public static void main(String[] args) {
        // Task 6: Nested loop to create the figure
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
