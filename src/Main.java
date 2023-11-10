public class Main {
    public static void main(String[] args) {
        // Create an array of dataPoints (you should replace this with your actual array)
        int[] dataPoints = { /* Your array elements here */ };

        double average = getAverage(dataPoints);
        System.out.println("Average of dataPoints is: " + average);
    }

    public static double getAverage(int values[]) {
        if (values.length == 0) {
            // Handle the case of an empty array to avoid division by zero
            return 0.0; // You can return 0 or any other appropriate value
        }

        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        return (double) sum / values.length;
    }
}
