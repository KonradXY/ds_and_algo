package _1_arrays_hashing._8_neetcode;

import java.util.HashSet;
import java.util.Set;

public class _1_8_7_ValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; ++i) {
            for (int j = 0; j < 9; ++j) {
                char number = board[i][j];
                if (number != '.' && (
                        !seen.add(number + " in row " + i) ||
                        !seen.add(number + " in column " + j) ||
                        !seen.add(number + " in block " + i / 3 + "-" + j / 3))
                )
                    return false;
            }
        }
        return true;
    }

    public boolean isValidSudoku2(char[][] board) {
        boolean[][] rows = new boolean[9][9];
        boolean[][] cols = new boolean[9][9];
        boolean[][] boxes = new boolean[9][9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char c = board[i][j];
                if (c == '.') continue;

                int num = c - '1';
                int boxIndex = (i / 3) * 3 + (j / 3);

                if (rows[i][num] || cols[j][num] || boxes[boxIndex][num]) {
                    return false;
                }

                rows[i][num] = true;
                cols[j][num] = true;
                boxes[boxIndex][num] = true;
            }
        }

        return true;
    }
}
