package String_Opertions;

import javax.crypto.spec.PSource;

public class StringReplace {
    public static void stringReplace1(){
        String str = "right";

        System.out.println(str.replace('r','f'));
        System.out.println(str.replace('r','t'));
        System.out.println(str.replace('r','l'));
    }

    public static void stringReplace2(){
        String str = "gun";

        char[] carr = {'b','f','s','r','n'};

        for (int i = 0; i < carr.length; i++){
            String replaced = str.replace('g',carr[i]);
            System.out.println(replaced);
        }
    }
    public static void stringReplace3(){
        String str = "Hi, Good Morning";
        System.out.println("String before replacing : " + str);
        System.out.println("after replacing : " + str.replace("Morning","Night"));
    }

    public static void main(String[] args) {
        stringReplace1();
        System.out.println();
        stringReplace2();
        System.out.println();
        stringReplace3();
    }
}
