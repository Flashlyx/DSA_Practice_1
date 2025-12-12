package Map_Basic_Programs.Unique_Elements;

import java.util.ArrayList;
import java.util.Arrays;
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
      public static ArrayList<String> uniqueWordsInSentence2(String str){

          String[] sarr = str.split(" ");

          Map<String,Integer> lhmap = new LinkedHashMap<>();

          for (int i = 0; i < sarr.length;i++){
              lhmap.put(sarr[i], lhmap.getOrDefault(sarr[i], 0) + 1);
          }
          ArrayList<String> res = new ArrayList<>();

          lhmap.forEach((key, value) -> {
              if (value == 1){
                  res.add(key);
              }
          });
          return res;
      }

    public static void main(String[] args) {

        System.out.println(
                uniqueWordsInSentence2("hi hi hello how how how are are you ! ")
        );
    }
}
