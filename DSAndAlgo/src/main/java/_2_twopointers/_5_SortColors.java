package _2_twopointers;

public class _5_SortColors {

    /**
     Given an array nums with n objects colored red, white, or blue, sort them in-place so that objects of the same color are adjacent,
     with the colors in the order red, white, and blue.
     We will use the integers 0, 1, and 2 to represent the color red, white, and blue, respectively.
     You must solve this problem without using the library's sort function.
     */

    public void sortColors(int[] nums) {
        int low = 0;
        int high = nums.length - 1;
        int mid = 0;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap(nums, mid, high);
                high--;
            }
        }
    }

    private static void swap(int[] nums, int left, int right) {
        int temp = nums[left];
        nums[left] = nums[right];
        nums[right] = temp;
    }

    /** SPIEGAZIONE: e' un caso del national dutch flag problem
     -> Maintain three pointers low and mid at 0, high at end.
     -> Iterate mid & whenever there is 0 put that to extream left by swapping it with low and increment low and mid.
     -> Whenever there is 1 just let it be there and increment mid.
     -> whenever there is 2 put that to extream right by swapping nums[mid] with nums[high].
     */
}
