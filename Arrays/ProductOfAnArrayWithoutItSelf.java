package Arrays;

import java.util.Arrays;

public class ProductOfAnArrayWithoutItSelf {

    public static void productOfAnArrayWithoutItSelf(int[] arr) {
        int[] result = new int[arr.length];
        int totalSum = 1;
        for (int val : arr)
            totalSum *= val;
        for(int i  = 0;i<arr.length;i++)
            result[i] = totalSum/arr[i];
        System.out.println(Arrays.toString(result));
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4 };
        productOfAnArrayWithoutItSelf(arr);
    }
}
