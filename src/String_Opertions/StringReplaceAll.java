package String_Opertions;

public class StringReplaceAll {
    public static void stringReplaceAll(String str){

        System.out.println(str.replaceAll("[a-z]"," :)"));
        System.out.println(str.replaceAll("[0-9]"," :)"));
        System.out.println(str.replaceAll("[^a-z]",""));
        System.out.println(str.replaceAll("[a-zA-Z0-9]"," :)"));

    }

    public static void main(String[] args) {
        stringReplaceAll("Java8 90");
    }
}
