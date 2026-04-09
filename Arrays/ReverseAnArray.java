package Arrays;

public class ReverseAnArray {

    public static void reverseAnArray(int[] arr) {

        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }

    public static void displayArray(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverseAnArray(arr);
        displayArray(arr);
    }
}