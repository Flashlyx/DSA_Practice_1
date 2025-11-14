package String_Opertions;

public class StringLuckyNumber {
    public static int luckyNumber(int n, String s){
        int luckyNumber = 0;

        for (int i = 0; i < n; i++){
            int index = i + 1;
            int asciiValue = s.charAt(i);

            if (index % 2 != 0 || asciiValue % 2 != 0){
                luckyNumber = luckyNumber + (index * asciiValue);
            }
        }
        return luckyNumber;
    }

    public static void main(String[] args) {
        int n = 5;
        String s = "JAMES";

        System.out.println(luckyNumber(n,s));

        String a = "A";
        System.out.println((int) a.charAt(0));
    }
}
