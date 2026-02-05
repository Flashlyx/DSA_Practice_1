package Jspiders_Programming.ProgTest_10_1_26;

public class RevStr_KeepPosO_fNonStr {
    public static void revStrKeepPosOfNonStr(String str){

        char[] charr = str.toCharArray();

        int left = 0, right = charr.length -1;

        while (left < right){

            char leftCh = charr[left];
            char rightCh = charr[right];

            if (!Character.isAlphabetic(leftCh)){
                left++;
                continue;

            }
            if (!Character.isAlphabetic(rightCh)){
                right--;
                continue;
            }
            if (Character.isAlphabetic(leftCh) && Character.isAlphabetic(rightCh)){
                char temp = charr[left];
                charr[left] = charr[right];
                charr[right] = temp;

                left++;
                right--;

            }

        }

        System.out.println(charr);

    }

    public static void main(String[] args) {
        revStrKeepPosOfNonStr("My Age is 13");
    }
}
