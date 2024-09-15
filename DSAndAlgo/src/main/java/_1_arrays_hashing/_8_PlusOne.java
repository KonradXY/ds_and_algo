package _1_arrays_hashing;

public class _8_PlusOne {

    /**
     * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
     * The digits are ordered from most significant to least significant in left-to-right order.
     * The large integer does not contain any leading 0's.
     */

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        digits = new int[digits.length + 1];    // by default new array values are set to -->0 only
        digits[0] = 1;
        return digits;
    }


}
