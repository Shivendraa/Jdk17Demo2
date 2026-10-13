package probllems;

import java.util.*;

public class FrequencyCounter {
    // Given a text (statement), you have to find count of words present in the text
    // i want count for each vowel
    public static void main(String[] args) {
        String text = "Hi, My name is Sania. I am Raisoni Student. I am a good student, I won student of the year.";
        text = text.toLowerCase();
        text = text.replace(",", "");
        text = text.replace(".", "");
        String[] strArr = text.split(" ");
        Map<String, Integer> vowels = new TreeMap<>();
        System.out.println(Arrays.toString(strArr));

        for(int i = 0; i < strArr.length; i++) {
            if(vowels.containsKey(strArr[i])) {
                int currentCount = vowels.get(strArr[i]) + 1;
                vowels.put(strArr[i], currentCount); //replaces 1 with currentKey
            } else {
                vowels.put(strArr[i], 1);
            }
        }

        for (Map.Entry<String,Integer> entry : vowels.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }

        //System.out.println(vowels);


    }
}
