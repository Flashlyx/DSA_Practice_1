package Reverse_String;

public class ReverseStringBF {
    public static String reverseString(String s){
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args){

        String s1 = "hello";
        String s2 = "flashly";

        System.out.println(reverseString(s1));
        System.out.println(reverseString(s2));
    }
}
