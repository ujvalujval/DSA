package Arrays;

import java.util.Arrays;

public class AntiClockWiseRotation {

    public static void antiClockWiseRotation(int[] arr, int rotateTimes) {

        for (int j = 0; j < rotateTimes % arr.length; j++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--)
                arr[i] = arr[i - 1];
            arr[0] = temp;
        }
        System.out.println(Arrays.toString(arr));

    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int rotateTimes = 2;
        antiClockWiseRotation(arr, rotateTimes); // [4, 5, 1, 2, 3]
    }
}
