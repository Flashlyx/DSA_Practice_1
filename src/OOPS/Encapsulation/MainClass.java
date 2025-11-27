package OOPS.Encapsulation;


public class MainClass {
    public static void main(String[] args) {

        Encap_Ex1 s1 = new Encap_Ex1();

        s1.setStd_id(1);
        s1.setStd_name("Logan");

        System.out.println(s1.getStd_id());
        System.out.println(s1.getStd_name());
    }
}
