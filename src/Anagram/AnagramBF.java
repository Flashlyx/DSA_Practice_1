package Anagram;

import java.util.Arrays;

public class AnagramBF {
    public static boolean isAnagramBF(String a, String b){

        a = a.toLowerCase();
        b = b.toLowerCase();
        
        if (a.length() != b.length()){
            return false;
        }

        char[] a_char = a.toCharArray();
        char[] b_char = b.toCharArray();

        Arrays.sort(a_char);
        Arrays.sort(b_char);

        return Arrays.equals(a_char, b_char);
    }
    public static void main(String[] args){
        boolean res1 = isAnagramBF("silent","listen");
        System.out.println(res1);

        System.out.println(isAnagramBF("Array","array"));
        System.out.println(isAnagramBF("moon","hi"));
    }
}