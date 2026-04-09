package Arrays;

public class MovingZerosToEnd {

    public static void movingZerosToEnd(int[] arr) {

        int pos = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0)
                arr[pos++] = arr[i];
        }

        while (pos < arr.length)
            arr[pos++] = 0;
        for (int val : arr)
            System.out.print(val + " ");
    }

    public static void main(String[] args) {
        int[] arr = { 0, 0, 4, 0, 3, 0, 0 };
        movingZerosToEnd(arr);
    }
}
