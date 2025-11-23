package Basic_Problems;

import java.util.Arrays;

public class Reverse_String {
    public static String reverseString(String str){
        StringBuilder sb = new StringBuilder();
        // jayeesh
        // 0123456
        for (int i = str.length() - 1; i >= 0; i--){
            sb.append(str.charAt(i));
        }
        String res = sb.toString();
        return res;
    }

    public static String reverseString2(String str){


        char[] sarr = str.toCharArray();
        int left = 0 , right = sarr.length - 1;

        while (left < right){

            char temp = sarr[left];
            sarr[left] = sarr[right];
            sarr[right] = temp;

            left++;
            right--;
        }
        return new String(sarr);
    }

    public static void main(String[] args) {

        System.out.println(reverseString("jayeesh"));
        System.out.println(reverseString("samuel"));

        System.out.println(reverseString2("Mehtod"));
    }
}
