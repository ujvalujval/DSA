package Arrays;

public class PlusOne {

    public static void plusOne(int[] arr) {

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] < 9) {
                arr[i]++;
                displayArray(arr);
                return;
            } else
                arr[i] = 0;
        }

        int[] newArr = new int[arr.length + 1];
        newArr[0] = 1;
        for (int i = 1; i < newArr.length; i++) {
            newArr[i] = arr[i - 1];
        }
        displayArray(newArr);

    }

    public static void displayArray(int[] arr) {
        for (int val : arr)
            System.out.print(val + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 2 };
        plusOne(arr);
    }
}
