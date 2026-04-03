package Arrays;

import java.util.*;

public class TwoSum {

    public static int[] twosum(int[] arr, int target) {

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int remaining = target - arr[i];
            if(map.containsKey(remaining)) return new int[]{map.get(remaining), i};
            else map.put(arr[i], i);
        }
        return new int[] { -1, -1 };
    }
    public static void main(String[] args) {
        int[] arr = { 0,4,3,0};
        int target = 0;
        int[] result = twosum(arr, target);
        System.out.println(Arrays.toString(result));
    }
}
