public class ArrayUtils {

    public static int min(int values[]) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int minValue = values[0];

        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }

    public static int max(int values[]) {
        if (values == null || values.length == 0) {
            throw new IllegalArgumentException("Array is empty or null.");
        }

        int maxValue = values[0];

        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }

    public static int occurrenceScan(int values[], int target) {
        int count = 0;

        for (int value : values) {
            if (value == target) {
                count++;
            }
        }

        return count;
    }

    public static int sum(int values[]) {
        int total = 0;

        for (int value : values) {
            total += value;
        }

        return total;
    }

    public static boolean contains(int values[], int target) {
        for (int value : values) {
            if (value == target) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] values = {1, 2, 3, 4, 5, 2, 3, 1};

        int minResult = min(values);
        int maxResult = max(values);
        int occurrenceResult = occurrenceScan(values, 3);
        int sumResult = sum(values);
        boolean containsResult = contains(values, 6);

        System.out.println("Min: " + minResult);
        System.out.println("Max: " + maxResult);
        System.out.println("Occurrences of 3: " + occurrenceResult);
        System.out.println("Sum: " + sumResult);
        System.out.println("Contains 6: " + containsResult);
    }
}

