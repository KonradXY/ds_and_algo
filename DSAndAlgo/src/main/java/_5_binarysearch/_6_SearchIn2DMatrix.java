package _5_binarysearch;

public class _6_SearchIn2DMatrix {

    /**
     You are given an m x n integer matrix matrix with the following two properties:

     Each row is sorted in non-decreasing order.
     The first integer of each row is greater than the last integer of the previous row.
     Given an integer target, return true if target is in matrix or false otherwise.

     You must write a solution in O(log(m * n)) time complexity.

     */


    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0)
            return false;
        int n = matrix.length;
        int m = matrix[0].length;
        int left = 0;
        int right = (n * m) - 1;
        while (left <= right) {
            int mid = (left + (right - left) / 2);
            int row = mid / m;
            int col = mid % m;
            if (matrix[row][col] == target) return true;
            else if (matrix[row][col] < target) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
}

    /** SPIEGAZIONE
     Date le proprieta della matrice, essa puo' essere considerata come un array ordinato.
     Basta quindi procedere con la binary search x arrivare al valore target
     */
