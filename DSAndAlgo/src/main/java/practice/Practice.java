package practice;

import java.util.ArrayList;
import java.util.List;

public class Practice {

    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        if (x <= arr[0]) {
            return sublist(arr, 0, k);
        }
        if (x >= arr[arr.length - 1]) {
            return sublist(arr, arr.length - k, arr.length);
        }

        int leftPivot = getLeftPosition(arr, 0, arr.length - 1, x);
        int rightPivot = leftPivot + 1;

        while (k >= 0) {
            if (leftPivot == 0) {
                rightPivot++;
            } else if (rightPivot == arr.length - 1) {
                leftPivot--;
            } else if (Math.abs(arr[leftPivot] - x) <= Math.abs(arr[rightPivot] - x)) {
                leftPivot--;
            } else {
                rightPivot++;
            }
            k--;
        }

        List<Integer> result = new ArrayList<>();
        for (int i = leftPivot; i < rightPivot; i++) {
            result.add(arr[i]);
        }

        return result;
    }


    //Returns sub list from [start, end)
    List<Integer> sublist(int[] arr, int start, int end) { //Not including end
        List<Integer> sub = new ArrayList<>();
        for (int i = start; i < end; i++) {
            sub.add(arr[i]);
        }

        return sub;
    }

    private static int getLeftPosition(int[] arr, int left, int right, int key) {
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (arr[mid] >= key) {
                right = mid;
            } else {
                left = mid;
            }
        }
        return right;
    }

    private static int getRightPosition(int[] arr, int left, int right, int key) {
        while (right - left > 1) {
            int mid = left + (right - left) / 2;
            if (arr[mid] <= key) {
                left = mid;
            } else {
                right = mid;
            }
        }
        return left;
    }


}
