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
        int slow = nums[0];
        int fast = nums[0];

        do {
            slow = nums[slow];
            fast = nums[nums[fast]];

        } while (slow != fast);

        fast = nums[0];
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }

        return slow;
    }

}
