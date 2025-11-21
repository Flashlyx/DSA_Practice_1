package Basic_Problems;

public class HCF_LCM {

    public static int HCF(int num1,int num2){

        while(num2 != 0){
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }
        return num1;
    }

    static public int  LCM(int num1, int num2){
        int lcm = ((num1 * num2) / HCF(num1,num2)) ;
        return lcm;
    }

    public static void main(String[] args) {
        System.out.println(HCF(10, 20));
        System.out.println(HCF(12, 48));

        System.out.println(LCM(12, 5));
    }
}
