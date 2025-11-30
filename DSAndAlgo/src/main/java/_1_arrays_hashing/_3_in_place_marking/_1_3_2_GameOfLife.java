package _1_arrays_hashing._3_in_place_marking;

public class _1_3_2_GameOfLife {

    /*

    We want to store old state and new state at the same time inside one integer.

    +-----------+-----------+---------+
    | old state | new state | encoded |
    +-----------+-----------+---------+
    |     0     |     0     |    0    |
    |     1     |     0     |    1    |
    |     0     |     1     |    2    |
    |     1     |     1     |    3    |
    +-----------+-----------+---------+

    Each value is interpreted in this way:

    Encoded value 0:
    old=0, new=0
    dead → dead

    Encoded value 1:
    old=1, new=0
    live → dead

    Encoded value 2:
    old=0, new=1
    dead → live

    Encoded value 3:
    old=1, new=1
    live → live

     */

    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;

        // Encode the matrix in-place
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                int n = countNeighbors(board, r, c);

                if (board[r][c] == 0) {
                    if (n == 3) board[r][c] = 2;        // dead -> lives

                } else if (board[r][c] == 1) {
                    if (n < 2) board[r][c] = 1;         // lives -> dies
                    else if (n <= 3) board[r][c] = 3;   // lives -> lives
                    else board[r][c] = 1;               // lives -> dies
                }

            }
        }

        // Decode to new state
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                if (board[r][c] == 1) board[r][c] = 0;
                else if (board[r][c] == 2) board[r][c] = 1;
                else if (board[r][c] == 3) board[r][c] = 1;
                else board[r][c] = 0;
            }
        }
    }

    private int countNeighbors(int[][] board, int row, int col) {
        int count = 0;
        for (int r = row - 1; r <= row + 1; r++) {
            for (int c = col - 1; c <= col + 1; c++) {

                if (r == row && c == col) continue;             // exclude itself
                if (r < 0 || r >= board.length) continue;       // out of bounds
                if (c < 0 || c >= board[0].length) continue;    // out of bounds

                if (board[r][c] == 1 || board[r][c] == 3) count++;
            }
        }
        return count;
    }

}
