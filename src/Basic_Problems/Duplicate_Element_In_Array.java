package Basic_Problems;


public class Duplicate_Element_In_Array {
    public static void duplicateElementsInArray(int[] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i] == arr[j]){
                    System.out.println(arr[i]);
                    break;
                }

            }
        }
    }
    public static void duplicateElementsInArray(String[] arr){

        for (int i = 0; i < arr.length; i++){
            for (int j = i + 1; j < arr.length; j++){
                if (arr[i].equals(arr[j])){
                    System.out.println(arr[i]);
                    break;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[] arr1 = {10, 20 ,30 ,10 ,40, 20};
        duplicateElementsInArray(arr1);

        String[] arr2 = {"flash", "jack", "logan", "flash","logan", "Jack", "max"};
        duplicateElementsInArray(arr2);

    }
}
