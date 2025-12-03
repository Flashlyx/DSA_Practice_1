package PrintStream;

class Demo{
    public String display(String str){
        return str;
    }
}
class Sample{
    static Demo d1 = new Demo();
}
public class Print_Stream_Working_EX {
    public static void main(String[] args) {
        String s = Sample.d1.display("Flash !");
        System.out.println(s);
    }
}