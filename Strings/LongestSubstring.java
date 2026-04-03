package Strings;

import java.util.HashSet;

public class LongestSubstring {

    public static int longestsubstring(String s) {
        int left = 0;
        int maxLength = 0;
        HashSet<Character> set = new HashSet<>();
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        String str = "aab1234";
        System.out.println(longestsubstring(str));
    }
}