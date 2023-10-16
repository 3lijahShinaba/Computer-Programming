public class NestedLoops {
    public static void main(String[] args) {
        // Task 5: Nested loop to create the figure
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


