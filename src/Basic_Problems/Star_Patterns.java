package Basic_Problems;

public class Star_Patterns {
    public static void rightTriangleUp(){

        for (int i = 0; i <=5; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void leftTriangleUp(){

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print("   ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("*  ");
            }
            System.out.println();
        }
    }

    public static void pyramidUp(){

        int n = 5;

        for (int i = 1; i <= n; i++) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pyramidDown(){

        int n = 5;

        for (int i = n; i >= 1; i--) {

            for (int s = 1; s <= n - i; s++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        rightTriangleUp();

        System.out.println();

        leftTriangleUp();

        System.out.println();

        pyramidUp();

        System.out.println();

        pyramidDown();
    }
}
