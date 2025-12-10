package _2_twopointers;

public class _1_FindDuplicateNumber {

    /**
     given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
     There is only one repeated number in nums, return this repeated number.
     You must solve the problem without modifying the array nums and uses only constant extra space.

     SOLUTION: usiamo l'algoritmo di floyd x verificare l'esistenza del ciclo semplicemente perche' sappiamo che maxVal(array) = array.length =>
     x cui possiamo usare l'algoritmo direttamente sull'array.
     */

    public int findDuplicate(int[] nums) {
        // Phase 1: Detect cycle
        int slow = nums[0];
        int fast = nums[nums[0]];

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        // Phase 2: Find cycle entrance (duplicate number)
        fast = 0;

        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

    public int findDuplicate2(int[] nums) {
        int left = 1, right = nums.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            int count = 0;
            for (int num : nums) {
                if (num <= mid) count++;
            }

            if (count > mid) right = mid;
            else left = mid + 1;
        }

        return left;
    }

}
