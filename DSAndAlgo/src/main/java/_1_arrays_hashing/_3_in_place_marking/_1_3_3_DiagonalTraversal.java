package _1_arrays_hashing._3_in_place_marking;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class _1_3_3_DiagonalTraversal {

    public int[] findDiagonalOrder(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;

        int[] result = new int[rows * cols];
        int count = 0;

        // number of diagonals = rows + cols - 1
        int diagonals = rows + cols - 1;

        for (int d = 0; d < diagonals; d++) {
            List<Integer> temp = new ArrayList<>();

            // Starting rows for diagonal
            int row = (d < cols) ? 0 : d - (cols - 1);

            // Ending rows for diagonal
            int end = Math.min(d, rows - 1);

            while (row <= end) {
                int col = d - row; // column is determined from row+d
                temp.add(mat[row][col]);
                row++;
            }

            // If diagonal number is even → reverse
            if (d % 2 == 0) {
                Collections.reverse(temp);
            }

            for (int val : temp) {
                result[count++] = val;
            }
        }

        return result;
    }

    public int[] findDiagonalOrder2(int[][] mat) {
        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows * cols];

        int row = 0, col = 0;
        int count = 0;
        boolean up = true;  // direction flag

        while (count < rows * cols) {
            result[count++] = mat[row][col];

            if (up) {                       // moving up-right
                if (col == cols - 1) {      // hit right boundary
                    row++;                  // move down
                    up = false;             // switch direction
                } else if (row == 0) {      // hit top boundary
                    col++;                  // move right
                    up = false;             // switch direction
                } else {
                    row--;                  // normal up-right movement
                    col++;
                }
            } else {                        // moving down-left
                if (row == rows - 1) {      // hit bottom boundary
                    col++;                  // move right
                        up = true;          // switch direction
                } else if (col == 0) {      // hit left boundary
                    row++;                  // move down
                    up = true;              // switch direction
                } else {
                    row++;                  // normal down-left movement
                    col--;
                }
            }
        }

        return result;
    }
}
