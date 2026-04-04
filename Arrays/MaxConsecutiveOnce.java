package Arrays;

public class MaxConsecutiveOnce {

    public static int maxConsecutiveOnce(int[] arr) {
        
        int MaxOnce = 0, Count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                Count++;
                MaxOnce = Math.max(MaxOnce, Count);
            } else
                Count = 0;
        }
        return MaxOnce;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 1, 0, 0, 0, 1, 1, 1, 1 };
        System.out.println(maxConsecutiveOnce(arr)); // 4
    }
}