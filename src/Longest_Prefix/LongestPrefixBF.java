package Longest_Prefix;

public class LongestPrefixBF {

    public static String longestPrefixBF(String[] strs){
        if (strs == null || strs.length ==
                0){
            return "Empty!";
        }
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++){

            while (strs[i].indexOf(prefix) !=0){

                prefix = prefix.substring(0 , prefix.length() -1);

                if (prefix.isEmpty()){
                    return "No Common Prefix";
                }
            }
        }
        return prefix;
    }

    public static void main(String[] args){
        String[] strs1 = {"flower","flow","flo"};
        String[] strs2 = {"flower","flow","car"};
        String[] strs3 = {"flash"};
        String[] strs4 = {"flower","flow","flo"};
        String[] strs5 = {};

        System.out.println(longestPrefixBF(strs1));
        System.out.println(longestPrefixBF(strs2));
        System.out.println(longestPrefixBF(strs3));
        System.out.println(longestPrefixBF(strs4));
        System.out.println(longestPrefixBF(strs5));
    }
}
