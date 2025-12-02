package Inner_Class;

class Jack{

    static class Fisher{

        public void display(){
            System.out.println("Hey I am inner class's Method !");
        }
    }

}
public class Static {
    public static void main(String[] args) {

        Jack.Fisher jf = new Jack.Fisher();

        jf.display();
    }
}
