package Arrays;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsduplicates(int[] arr) {

        Set<Integer> set = new HashSet<>();
        for (int val : arr)
            set.add(val);
        return arr.length == set.size();

        // Using Streams
        // Set<Integer> set1 = Arrays.stream(arr).boxed().collect(Collectors.toSet());
        // return arr.length == set1.size();
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1 };
        System.out.println(containsduplicates(arr));
    }
}