package Arrays;

public class ReverseArrayGroup {

    public static void reverseAnArray(int[] arr, int group) {

        for (int i = 0; i < arr.length; i += group) {
            int left = i;
            int right = i + group - 1;
            while (left < right) {
                arr[left] = arr[left] ^ arr[right];
                arr[right] = arr[left] ^ arr[right];
                arr[left] = arr[left] ^ arr[right];
                left++;
                right--;
            }
        }

        for (int val : arr)
            System.out.print(val + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int group = 4;
        reverseAnArray(arr, group);
    }
}
