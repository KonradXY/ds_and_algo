package _1_arrays_hashing._3_in_place_marking;

public class _1_3_1_SetMatrixZeroes {

    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];

        // Step 1: record which rows and columns must be zeroed
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }

        // Step 2: apply zeroing based on the markers
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
