package ASCII_Value;

public class ChangeCaseOfChar {
    public static String changeCaseOfChar(String str){

        StringBuilder res = new StringBuilder();
        for (int i = 0; i < str.length(); i++){

            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z'){
                char caseChanged = (char) (ch - 32);
                res.append(caseChanged);

            } else if (ch >= 'A' && ch <='Z'){
                char caseChanged = (char) (ch + 32);
                res.append(caseChanged);
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {

        System.out.println(changeCaseOfChar("HeLlo"));

        System.out.println(changeCaseOfChar("mEthOD OverLoadinG"));
    }
}
