package _1_arrays_hashing._2_spiral_traversing;

public class _1_2_4_SpiralTraverseIII {

    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int total = rows * cols;
        int[][] result = new int[total][2];

        int[][] directions = new int[][]{
                {0, 1},     // left to right
                {1, 0},     // top to bottom
                {0, -1},    // right to left
                {-1, 0}     // bottom to top
        };

        int count = 0, dir = 0;
        int steps = 1;
        int r = rStart, c = cStart;

        while (count < total) {
            for (int step = 0; step < steps; step++) {
                if (r >= 0 && r < rows && c >= 0 && c < cols) {
                    result[count++] = new int[]{r, c};
                }

                r = r + directions[dir][0];
                c = c + directions[dir][1];
            }

            dir = (dir + 1) % 4;        // next direction
            if (dir % 2 == 0) steps++;  // increase n of steps after 2 traversals

        }
        return result;
    }
}
