package Arrays;

import java.util.*;

public class GroupAnagrams {

    public static void groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();
        for (int i = 0; i < strs.length; i++) {
            char[] wordSplit = strs[i].toCharArray();
            Arrays.sort(wordSplit);
            String word = new String(wordSplit);
            if (!map.containsKey(word))
                map.put(word, new ArrayList<>());
            map.get(word).add(strs[i]);
        }
        System.out.println(map.values());
    }
    public static void main(String[] args) {
        String[] strs = { "eat", "tea", "tan", "ate", "nat", "bat" };
        groupAnagrams(strs);
        // [[eat,tea, ate],[bat], [tan, nat]]
    }
}