package Arrays;

public class SortedAndRotateVerify {

    public static boolean sortedAndRotateVerify(int[] arr) {
        int count = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] < arr[i])
                count++;
        }
        int end = count;
        for (int i = arr.length - 1; i >= end; i--) {
            if (arr[0] > arr[i]) 
                count++;
        }
        return count == arr.length;
    }

    public static void main(String[] args) {
        int[] arr = { 3, 4, 5, 1, 2 };
        System.out.println(sortedAndRotateVerify(arr));
    }
}
