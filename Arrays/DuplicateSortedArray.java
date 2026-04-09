package Arrays;

import java.util.Arrays;

public class DuplicateSortedArray {

    public static int[] duplicateSortedArray(int[] arr) {

        int index = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] != arr[i])
                arr[index++] = arr[i];
        }
        while (index < arr.length)
            arr[index++] = 0;
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 2, 3, 4 };
        duplicateSortedArray(arr);
        System.out.println(Arrays.toString(arr));
    }
}
