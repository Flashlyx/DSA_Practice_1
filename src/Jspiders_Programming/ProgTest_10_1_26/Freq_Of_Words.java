package Jspiders_Programming.ProgTest_10_1_26;

import java.util.LinkedHashMap;
import java.util.Map;

public class Freq_Of_Words {
    public static void freqOfWords(String str){

        String[] strarr = str.split(" ");
        Map<String, Integer> map = new LinkedHashMap<>();

        for(String s : strarr){
            map.put(s, map.getOrDefault(s,0) + 1);
        }

        map.forEach((key, value)->
        {
            System.out.println("Word : "  + key + "  | Freq : " + value);
        }
        ) ;
    }

    public static void main(String[] args) {
        String str1 = "apple can be red apple and green apple";

        freqOfWords(str1);
    }
}
