package String_Builder;

public class String_Builder {
    public static void ex1(){

        StringBuilder sb1 = new StringBuilder("Hello ");

        sb1.append("Flash ");
        System.out.println(sb1);
        sb1.append("Jayeesh");
        System.out.println(sb1);

        sb1.reverse();
        System.out.println(sb1);

        sb1.deleteCharAt(2);
        System.out.println(sb1);

    }
    public static void main(String[]args){
        String_Builder.ex1();
    }
}
