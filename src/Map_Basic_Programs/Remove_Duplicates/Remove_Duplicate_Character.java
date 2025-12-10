package Map_Basic_Programs.Remove_Duplicates;

import java.util.LinkedHashMap;
import java.util.Map;

public class Remove_Duplicate_Character {
    public static void removeDuplicateCharInString(String str){
        // convert the string into char array
        char[] carr = str.toLowerCase().toCharArray(); // you can convert the string into lowercase

        Map<Character, Integer> cmap = new LinkedHashMap<>();

        for (char ch : carr){

            cmap.put(ch, cmap.getOrDefault(ch, 0) + 1);
        }

        cmap.forEach((key, value) -> {
            System.out.print(key);
        });
    }

    public static void main(String[] args) {

        String str1 = "MethodOverloading";
        System.out.println("Before : " + str1);

        System.out.print("After : ");
        removeDuplicateCharInString(str1);


    }
}
