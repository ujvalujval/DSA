package Arrays;

public class MinimumAverageElInArray {

    public static double minimumAverageElInArray(int[] arr) {
        double averageEl = Double.MAX_VALUE;
        SortingArray(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                averageEl = Math.min(averageEl, (double) (arr[i] + arr[j]) / 2);
            }
        }
        return averageEl;
    }

    // Used Bubble Sorting Algorithm
    public static int[] SortingArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    arr[j] = arr[j] ^ arr[j + 1];
                    arr[j + 1] = arr[j] ^ arr[j + 1];
                    arr[j] = arr[j] ^ arr[j + 1];
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 2, 4, 5 };
        System.out.println(minimumAverageElInArray(arr));
        // Can take as two variables of first two minimumEl in Array and find their
        // Average;
    }
}
