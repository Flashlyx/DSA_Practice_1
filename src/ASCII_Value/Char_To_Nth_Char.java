package ASCII_Value;

public class Char_To_Nth_Char {
    public static String toNthChar(String str, int n){

        StringBuilder res = new StringBuilder();


        for (int i = 0; i < str.length();i++){

            char ch = str.charAt(i);
            char nthChar = (char) (ch + (n));
            res.append(nthChar);


        }
        return res.toString();
    }

    public static void main(String[] args) {

        System.out.println(toNthChar("hello",4));

        System.out.println(toNthChar("jayeesh",3));
    }
}
