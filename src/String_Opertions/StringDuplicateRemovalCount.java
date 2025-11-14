package String_Opertions;

public class StringDuplicateRemovalCount {
    public static int countDuplicateRemoval(String s){

        int removalCount = 0;

        for (int i = 0; i < s.length()- 1; i++){

            if (s.charAt(i) == s.charAt(i + 1)){
                removalCount++;
            }
        }
        return removalCount;
    }

    public static void main(String[] args) {

        String s1 = "aabccd";
        System.out.println(countDuplicateRemoval(s1));

        String s2 = "abcdef";
        System.out.println(countDuplicateRemoval(s2));

        String s3 = "aabccddeeff";
        System.out.println(countDuplicateRemoval(s3));


    }
}
