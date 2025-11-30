package _1_arrays_hashing._5_handling_carry;

public class _1_5_1_PlusOne {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits; // no carry needed
            }
            digits[i] = 0; // digit rolls over
        }

        // If we reach here, all digits were 9
        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }


}
