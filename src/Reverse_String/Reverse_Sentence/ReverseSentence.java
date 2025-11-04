package Reverse_String.Reverse_Sentence;

import java.util.Arrays;

import static Reverse_String.ReverseStringOpt.reverseStringOpt;

public class ReverseSentence {
    public static String reversSentence(String str){

        String[] sarr = str.split(" ");
        String result = "";

        for (int i = sarr.length - 1; i >= 0; i--){
            result = result + " " + sarr[i];
        }
        return result;
    }
    public static String reverseWordsAndString(String str){
        String[] sarr = str.split(" ");
        String result = "";
        for (int i = sarr.length - 1; i >= 0; i--){
            result += " " + reverseStringOpt(sarr[i]);
        }
        return result;
    }
    public static String reverseWordsInString(String str){

        String[] sarr = str.split(" ");
        String result = "";

        for (int i = 0; i < sarr.length; i++){
            result += " " + reverseStringOpt(sarr[i]);
        }
        return result;
    }

    public static void main(String[] args) {
        String str1 = "Good Morning, Have a nice day !";

        System.out.println(reversSentence(str1));

        System.out.println(reverseWordsAndString(str1));

        System.out.println(reverseWordsInString(str1));

    }
}
