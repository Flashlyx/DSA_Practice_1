package MedianOfTwoSortedArrays;

import java.io.FilterOutputStream;
import java.util.Arrays;

public class MedianOfTwoSortedArraysBF {
    public static double findMedianOfTwoSortedArrays(int[] nums1, int[] nums2) {

        int[] mergedArray = new int[nums1.length + nums2.length];

        for(int i = 0; i < nums1.length; i++){
            mergedArray[i] = nums1[i];
        }

        for(int j = 0; j < nums2.length; j++){
            mergedArray[nums1.length + j] = nums2[j];
        }

        Arrays.sort(mergedArray);

        int totalLength = mergedArray.length;
        if (totalLength % 2 == 0) {
            int middle1 = mergedArray[(totalLength / 2) - 1];
            int middle2 = mergedArray[totalLength / 2];
            return (double) (middle1 + middle2) / 2.0;
        } else {
            return mergedArray[totalLength / 2];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,6};
        int[] arr2 = {8,9,10};
        System.out.println(findMedianOfTwoSortedArrays(arr1, arr2));
    }
}

