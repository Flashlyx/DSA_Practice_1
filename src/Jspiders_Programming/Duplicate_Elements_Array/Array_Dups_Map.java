package Jspiders_Programming.Duplicate_Elements_Array;

import java.util.LinkedHashMap;
import java.util.Map;

public class Array_Dups_Map {
    public static void duplicatesInArrayUsingMap(int[] arr){

        Map<Integer,Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0) + 1);
        }

        map.forEach((key,val) ->{
            System.out.println("Num : " + key + " Freq : " + val );
        });
    }

    public static void main(String[] args) {
        int[] arr1 = {1,1,3,4,7,4,3,6};

        duplicatesInArrayUsingMap(arr1);
    }
}
