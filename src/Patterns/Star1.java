package Patterns;

import java.security.spec.RSAOtherPrimeInfo;

public class Star1 {

    public static void star1(){

        for (int i = 1; i <= 5; i++){
            for (int j = 1; j <= i; j++ ){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void star2(){
        for (int i = 5; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print(j +" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        star1();
        star2();
    }
}
