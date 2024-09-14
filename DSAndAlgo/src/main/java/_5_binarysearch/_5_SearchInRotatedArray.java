package _5_binarysearch;

public class _5_SearchInRotatedArray {

    /**
     There is an integer array nums sorted in ascending order (with distinct values).
     Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length)
     such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed).
     For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

     Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.
     You must write an algorithm with O(log n) runtime complexity.
     */


    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) return mid;
            else if (nums[left] <= target && target < nums[mid]) {
                if (nums[mid] > target) right = mid - 1;
                else left = mid + 1;
            } else if (nums[mid] < target && target <= nums[right]) {
                if (nums[mid] > target) right = mid - 1;
                else left = mid + 1;
            }
        }
        return -1;
    }


    /** SPIEGAZIONE
     La soluzione risiede sempre nel fatto che l'array mantiene la proprieta' di essere ordinato (anche se rotato).
     Questo significa che usando la binary search, dividendo l'array a meta', avremo una parte ordinata e una no (ovvero val[left] > val[right]).
     Seguendo questo criterio saremo in grado di trovare il valore che
     */
}
