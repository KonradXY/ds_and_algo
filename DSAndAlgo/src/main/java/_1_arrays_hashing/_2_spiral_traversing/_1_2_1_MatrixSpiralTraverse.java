package _1_arrays_hashing._2_spiral_traversing;

import java.util.ArrayList;
import java.util.List;

public class _1_2_1_MatrixSpiralTraverse {

    public List<Integer> spiralOrder(int[][] matrix) {
        int left = 0;
        int top = 0;
        int right = matrix[0].length;          // need to add -1 to don't get index OOB ex
        int bottom = matrix.length;      // need to add -1 to don't get index OOB ex

        List<Integer> result = new ArrayList<>();

        while (left < right && top < bottom) {
            // Traverse top row left → right
            for (int i = left; i < right; i++) {
                result.add(matrix[top][i]);
            }
            top++;

            // Traverse right column top → bottom
            for (int i = top; i < bottom; i++) {
                result.add(matrix[i][right - 1]);
            }
            right--;

            // Check if we still have remaining rows/cols
            if (!(left < right && top < bottom)) {
                break;
            }

            // Traverse bottom row right → left
            for (int i = right - 1; i >= left; i--) {
                result.add(matrix[bottom - 1][i]);   // FIXED
            }
            bottom--;

            // Traverse left column bottom → top
            for (int i = bottom - 1; i >= top; i--) {
                result.add(matrix[i][left]);
            }
            left++;
        }

        return result;

    }
}
