package Matrix.Spiral_Matrix;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralMatrix(int[][] matrix){
        List<Integer> result = new ArrayList<>();

        int row = matrix.length;
        int column = matrix[0].length;

        int top = 0;
        int bottom = row - 1;
        int left = 0;
        int right = column - 1;

        while(top <= bottom && left <= right){

            for (int i = left; i <= right; i++){
                result.add(matrix[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; i++){
                result.add(matrix[i][right]);
            }
            right--;

            if (top <= bottom){
                for (int i = right; i >= left; i--){
                    result.add(matrix[bottom][i]);
                }
                bottom--;
            }

            if (left <= right){
                for (int i = bottom; i >= top; i--){
                    result.add(matrix[i][left]);
                }
                left++;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}};
        System.out.println(spiralMatrix(matrix1));

        int[][] matrix2 = {
                {1,2,3},
                {2,3,4},
                {4,5,6},
                {6,7,8}};
        System.out.println(spiralMatrix(matrix2));
    }
}
