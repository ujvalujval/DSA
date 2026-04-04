package Arrays;

import java.util.Arrays;

public class ClockWiseRotation {

    public static void clockWiseRotation(int[] arr, int rotateTimes) {

        for (int j = 0; j < rotateTimes % arr.length; j++) {
            int temp = arr[0];
            for (int i = 1; i < arr.length; i++)
                arr[i - 1] = arr[i];
            arr[arr.length - 1] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int rotateTimes = 2;
        clockWiseRotation(arr, rotateTimes); // [3,4,5,1,2]
    }
}