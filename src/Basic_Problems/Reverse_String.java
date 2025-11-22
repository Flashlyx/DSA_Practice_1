package Basic_Problems;

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

    public static void main(String[] args) {

        System.out.println(reverseString("jayeesh"));
        System.out.println(reverseString("samuel"));
    }
}
