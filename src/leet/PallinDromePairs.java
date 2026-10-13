package leet;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PallinDromePairs {
    public static List<List<String>> findPalindromePairs(String[] words) {
        List<List<String>> result = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();

        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            for (int j = 0; j <= word.length(); j++) {
                String str1 = word.substring(0, j);
                String str2 = word.substring(j);

                // Case 1: If prefix is a palindrome
                if (isPalindrome(str1)) {
                    String reverseStr2 = new StringBuilder(str2).reverse().toString();
                    if (map.containsKey(reverseStr2) && map.get(reverseStr2) != i) {
                        result.add(Arrays.asList(reverseStr2, word));
                    }
                }

                // Case 2: If suffix is a palindrome
                // FIX: Added 'str1.length() > 0' to avoid double-counting exact full-word reverses
                if (!str1.isEmpty() && isPalindrome(str2)) {
                    String reverseStr1 = new StringBuilder(str1).reverse().toString();
                    if (map.containsKey(reverseStr1) && map.get(reverseStr1) != i) {
                        result.add(Arrays.asList(word, reverseStr1));
                    }
                }
            }
        }
        return result;
    }


    private static boolean isPalindrome(String s) {
        int left = 0, right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left++) != s.charAt(right--)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String[] words = {"bat", "tab", "cat", "tac"};
        List<List<String>> pairs = findPalindromePairs(words);

        System.out.println(pairs);
    }
}
