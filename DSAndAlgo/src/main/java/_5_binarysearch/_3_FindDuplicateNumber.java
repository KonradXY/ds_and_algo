package _5_binarysearch;

public class _3_FindDuplicateNumber {

    /**
     Given an array of integers nums containing n + 1 integers where each integer is in the range [1, n] inclusive.
     There is only one repeated number in nums, return this repeated number.
     You must solve the problem without modifying the array nums and uses only constant extra space.

     SOLUTION: the solution can be found also using floyd cycle algorithm. Here we use binary search.
     La soluzione si basa sul fatto che la binary search conta i numeri che sono minori di se stesso.
     La conta dei numeri <= se stesso dev'essere uguale a se stesso (sempre considerando che il range dei valori coincide con la grandezza dell'array)
     */

    public int findDuplicate(int[] nums) {
        int low = 1;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int cnt = 0;
            for (int a : nums) {
                if (a <= mid) ++cnt;    // conta dei numeri <= del pivot
            }
            if (cnt <= mid) low = mid + 1;
            else high = mid - 1;
        }
        return low;
    }

}
