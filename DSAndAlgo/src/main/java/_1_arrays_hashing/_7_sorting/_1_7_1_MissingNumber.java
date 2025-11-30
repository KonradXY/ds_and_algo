package _1_arrays_hashing._7_sorting;

public class _1_7_1_MissingNumber {

    public int missingNumber(int[] nums) {
        int n = nums.length;
        int total = n * (n + 1) / 2;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        return total - sum;
    }
}
