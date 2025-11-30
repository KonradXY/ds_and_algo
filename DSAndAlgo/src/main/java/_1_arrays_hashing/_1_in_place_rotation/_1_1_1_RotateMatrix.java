package _1_arrays_hashing._1_in_place_rotation;

public class _1_1_1_RotateMatrix {

    public void rotate(int[][] matrix) {
        int n = matrix.length;
        transpose(matrix, n);
        reverse(matrix, n);
    }

    private static void transpose(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }

    private static void reverse(int[][] matrix, int n) {
        for (int i = 0; i < n; i++) {
            int left = 0, right = n - 1;
            while (left < right) {
                int temp = matrix[i][left];
                matrix[i][left] = matrix[i][right];
                matrix[i][right] = temp;
                left++;
                right--;
            }
        }
    }


}
