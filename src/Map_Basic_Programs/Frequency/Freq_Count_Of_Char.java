package Map_Basic_Programs.Frequency;

import java.util.LinkedHashMap;
import java.util.Map;

public class Freq_Count_Of_Char {
    // freq count of characters in a String

    public static void countFreqOfCharInString(String str){
        // convert the string into char array
        char[] carr = str.toLowerCase().toCharArray(); // you can convert the string into lowercase

        Map<Character, Integer> cmap = new LinkedHashMap<>();

        for (char ch : carr){

            cmap.put(ch, cmap.getOrDefault(ch, 0) + 1);
        }

        cmap.forEach((key, value) -> {
            System.out.println("Char : " + key + " | Freq : " + value);
        });
    }

    public static void main(String[] args) {
        countFreqOfCharInString("MethodOverloading");
    }
}
