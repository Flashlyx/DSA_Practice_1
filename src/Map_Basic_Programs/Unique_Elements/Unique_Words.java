package Map_Basic_Programs.Unique_Elements;

import java.util.LinkedHashMap;
import java.util.Map;

public class Unique_Words {
    public static void uniqueWordsInSentence(String str){
        // Convert the sentence into String array using Split() function
        String[] sarr = str.split(" ");

        // create new empty linked hash map
        Map<String, Integer> map = new LinkedHashMap<>();

        // run a for each loop through the array (sarr)
        for(String s : sarr){
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // print the map using lambda
        map.forEach((key, value) -> {
            if (value == 1){
                System.out.println(key);
            }
        });
    }

    public static void main(String[] args) {
        uniqueWordsInSentence("hi hi hello how how how are are you ! ");
    }
}
