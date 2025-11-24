package Exception_Handling;

public class Run_Time_1 {

    public static void arithException1() throws ArithmeticException {
        int a = 10;
        int b = 0;
        int sum = a / b;
        System.out.println(sum);
    }

    public static void main(String[] args) {

        try{
            arithException1();
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception caug t !");
        }
    }
}
