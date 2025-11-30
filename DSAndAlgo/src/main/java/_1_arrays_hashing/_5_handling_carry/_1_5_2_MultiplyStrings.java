package _1_arrays_hashing._5_handling_carry;

public class _1_5_2_MultiplyStrings {

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n1 = num1.length();
        int n2 = num2.length();
        int[] res = new int[n1 + n2];  // maximum size

        for (int i = n1 - 1; i >= 0; i--) {
            int d1 = num1.charAt(i) - '0';

            for (int j = n2 - 1; j >= 0; j--) {
                int d2 = num2.charAt(j) - '0';

                int mul = d1 * d2;
                int sum = mul + res[i + j + 1];  // add to existing digit

                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }

        // Convert array to string (skip leading zeros)
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < res.length && res[i] == 0) i++;

        for (; i < res.length; i++) {
            sb.append(res[i]);
        }

        return sb.toString();
    }
}
