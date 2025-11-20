package ASCII_Value;

public class Char_Int {
    public static void main(String[] args) {
        char ch = 'a';
        int no = (int) ch + 4;
        System.out.println(no);

        ch = (char) no;
        System.out.println(ch);
    }
}
