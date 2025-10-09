package Longest_Prefix;

public class LongestPrefixOpt {
    public static String longestPrefixOpt(String[] strs){

        if (strs == null || strs.length == 0){
            return "Empty";
        }

        for (int i = 0; i < strs[0].length();i++){
            char c = strs[0].charAt(i);

            for (int j = 1; j < strs.length; j++){

                if (i == strs[j].length() || strs[j].charAt(i) != c){
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0];
    }
    public static void main(String[] args){
        String[] strs1 = {"flower","flow","flo"};
        String[] strs2 = {"flower","flow","car"};
        String[] strs3 = {"flash"};
        String[] strs4 = {"flower","flow","flo"};
        String[] strs5 = {};

        System.out.println(longestPrefixOpt(strs1));
        System.out.println(longestPrefixOpt(strs2));
        System.out.println(longestPrefixOpt(strs3));
        System.out.println(longestPrefixOpt(strs4));
        System.out.println(longestPrefixOpt(strs5));
    }
}
