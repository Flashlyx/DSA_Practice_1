package Basic_Problems;

import static Basic_Problems.Reverse_String.reverseString;

public class Reverse_Sentence {

    public static String reverseSentence(String str){

        StringBuilder sb = new StringBuilder();

        String[] sarr = str.split(" ");

        // str = "Hi good morning, have a nice day!"
        // sarr = 0   1     2       3   4  5    6 (index)

        for (int i = sarr.length - 1; i >= 0; i--){
            sb.append(sarr[i] + " ");
        }
        String res = sb.toString();
        return res;
    }

    public static String reverseSentenceAndWords(String str){

        StringBuilder sb = new StringBuilder();

        String[] sarr = str.split(" ");

        // str = "Hi good morning, have a nice day!"
        // sarr = 0   1     2       3   4  5    6 (index)

        for (int i = sarr.length - 1; i >= 0; i--){
            sb.append(reverseString(sarr[i]) + " ");
        }
        String res = sb.toString();
        return res;
    }

    public static void main(String[] args) {

        System.out.println(reverseSentence("Hi good morning, have a nice day!"));

        System.out.println(reverseSentenceAndWords("Hi good morning, have a nice day!"));
    }
}
