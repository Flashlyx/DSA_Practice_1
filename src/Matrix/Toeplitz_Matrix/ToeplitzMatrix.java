package Matrix.Toeplitz_Matrix;

public class ToeplitzMatrix {
    public static boolean isToeplitzMatrix(int[][] matrix){

        int row = matrix.length;
        int column = matrix[0].length;

        for (int i = 1; i < row; i++){
            for (int j = 1; j < column; j++){
                if (matrix[i][j] != matrix[i - 1][j - 1]){
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[][] matrix1 = {
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}};
        System.out.println(isToeplitzMatrix(matrix1));

        int[][] matrix2 = {
                {1,2,3},
                {2,3,4},
                {4,5,6}};
        System.out.println(isToeplitzMatrix(matrix2));
    }
}
