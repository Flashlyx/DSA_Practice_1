package Reverse_String;

public class ReverseStringOpt {
    public static String reverseStringOpt(String s){
        StringBuilder reverse = new StringBuilder();

        for (int i = s.length() - 1; i >=0; i--){
            reverse.append(s.charAt(i));
        }
        return reverse.toString();
    }
    public static void main(String[] args){

        String s1 = "hello";
        String s2 = "flashly";

        System.out.println(reverseStringOpt(s1));
        System.out.println(reverseStringOpt(s2));
    }
}
