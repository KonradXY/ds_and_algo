package _5_binarysearch;

public class _4_KthSmallestElementInSortedMatrix {

    /**
     Given an n x n matrix where each of the rows and columns is sorted in ascending order, return the kth smallest element in the matrix.
     Note that it is the kth smallest element in the sorted order, not the kth distinct element.
     You must find a solution with a memory complexity better than O(n2).

     SOLUTION: different approach can be used
     - sorting    (we sort the matrix and then find the kth element) complexity equal to kind of sort implemented
     - priority queues (we keep the size of the queue as k so at the end we have the kth value ordered) O(matrix) but we use extra memory for the queue

     checking that the problem states that the matrix is ordered we can also rely on the binary search
     */

    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix.length;
        int low = matrix[0][0];
        int high = matrix[n - 1][n - 1];

        while (low < high) {
            int mid = low + (high - low) / 2;
            int count = lessEqual(matrix, mid);
            if (count < k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;

    }

    //from left bottom or right top we count how many numbers are equal or less than our target
    public int lessEqual(int[][] matrix, int target) {
        int count = 0;
        int len = matrix.length;
        int i = len - 1;
        int j = 0;

        while (i >= 0 && j < len) {
            if (matrix[i][j] > target) i--;
            else {
                count = count + i + 1;
                j++;
            }
        }
        return count;
    }
}
