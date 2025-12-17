package Jspiders_Programming.Duplicate_Elements_Array;

public class Array_Dups_For {
    public static void duplicatesElementsInArray(int[] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == -1){
                    continue;
                }
                if (arr[j] == -1){
                    continue;
                }

                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    arr[j] = - 1;
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,1,3,4,7,4,3,6,2,1,3};

        duplicatesElementsInArray(arr);
    }
}
