package Reverse_String;

public class ReverseStringBF {
    public static String reverseStringBF(String s){
        String reverse = "";
        for(int i = s.length() - 1; i >= 0; i--){
            reverse = reverse + s.charAt(i);
        }
        return reverse;
    }
    public static void main(String[] args){

        String s1 = "hello";
        String s2 = "flashly";

        System.out.println(reverseStringBF(s1));
        System.out.println(reverseStringBF(s2));
    }
}
