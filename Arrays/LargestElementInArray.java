package Arrays;

public class LargestElementInArray {

    public static int largestElementInArray(int[] arr) {
        int largestEl = Integer.MIN_VALUE;
        for (int val : arr)
            if (val > largestEl)
                largestEl = val;
        return largestEl;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 30, 4, 5, 6, 7 };
        System.out.println(largestElementInArray(arr));
    }
}
