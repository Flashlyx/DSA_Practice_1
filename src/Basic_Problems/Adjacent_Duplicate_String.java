package Basic_Problems;

public class Adjacent_Duplicate_String {
    public static String adjacentWordRemove(String str){
        // str = "hi hi hello java java hi programming programming";
        StringBuilder sb1 = new StringBuilder();
        String[] sarr = str.split(" ");

        for(int i = 0; i < sarr.length - 1; i++){
            if(!sarr[i].equals(sarr[i+1])){
                sb1.append(sarr[i] + " ");
            }
        }
        sb1.append(sarr[sarr.length - 1]);

        return sb1.toString();
    }


    public static void main(String[] args) {
        String str1 = "hi hi hello java java hi programming programming";

        System.out.println(adjacentWordRemove(str1));
    }
}
