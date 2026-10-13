package leet;

import java.util.HashMap;
import java.util.Map;

public class LengthOfLongestSubString {
    public static void main(String[] args) {
        String input = "abcabcbb";
        int output = lengthOfLongestSubStr(input);
        System.out.println(output);
    }

    private static int lengthOfLongestSubStr(String str) {
        Map<Character, Integer> map = new HashMap<>();
        int left = 0;
        int max = 0;
        for(int right = 0; right < str.length(); right++) {
            char current = str.charAt(right);
            if(map.containsKey(current)) {
                left = Math.max(map.get(current)+1, left);
            }
            map.put(current, right);
            max = Math.max(max, right-left+1);
            System.out.println(map + " max: " +max +" right:" +right + " left:" + left);
        }
        return max;
    }
}
