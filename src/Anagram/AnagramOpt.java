package Anagram;

public class AnagramOpt {
    public static boolean isAnagramOpt(String a, String b){

        if (a.length() != b.length()){
            return false;
        }
        a = a.toLowerCase();
        b = b.toLowerCase();

        int[] charCount = new int[26];

        for (int i = 0; i < a.length(); i++){
            charCount[a.charAt(i) - 'a']++;
            charCount[b.charAt(i) - 'a']--;
        }

        for (int count : charCount){
            if (count != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        boolean res1 = isAnagramOpt("silent","listen");
        System.out.println(res1);

        System.out.println(isAnagramOpt("Array","array"));
        System.out.println(isAnagramOpt("moon","hi"));
    }
}
