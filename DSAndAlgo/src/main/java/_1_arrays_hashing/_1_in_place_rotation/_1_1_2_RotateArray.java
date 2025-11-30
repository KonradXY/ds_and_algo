package _1_arrays_hashing._1_in_place_rotation;

public class _1_1_2_RotateArray {

    // we swap by using cycles.
    // The elements to swap can be represented as a cycle (with k = 2 nums[0] - nums[2] - nums[4] - etc. form a cycle)
    // we swap those


    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;       // Normalize k

        int count = 0;
        for (int start = 0; count < n; start++) {   // interrupt the loop when all are moved
            int currentIdx = start;
            int currentValue = nums[start];

            do {
                int targetIdx = (currentIdx + k) % n;
                int temp = nums[targetIdx];
                nums[targetIdx] = currentValue;      // Place currentValue into correct spot
                currentValue = temp;                 // Update currentValue for the next move
                currentIdx = targetIdx;              // Move current pointer
                count++;
            } while (currentIdx != start);           // Continue the cycle until back at start
        }
    }





}
