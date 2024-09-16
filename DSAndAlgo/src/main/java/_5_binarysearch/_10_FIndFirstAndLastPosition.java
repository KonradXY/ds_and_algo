package _5_binarysearch;

public class _10_FIndFirstAndLastPosition {

    // Binary search approach O(log n)
    public int arrangeCoins(int n) {
        long left = 0; // we use "long" because we may get an integer overflow
        long right = n;
        while (left <= right) {
            long pivot = left + (right - left) / 2;
            long coinsUsed = pivot * (pivot + 1) / 2;
            if (coinsUsed == n) {
                return (int) pivot;
            }
            if (n < coinsUsed) {
                right = pivot - 1;
            } else {
                left = pivot + 1;
            }
        }
        return (int) right; // cast as an "int" because it was initiliazed as a "long"
    }


    // Math approach O(log n) (sqrt is logn)
    /*
    Let's revist our equation to calculate the area:
    (K * (K+1))/2 = N

    We know that our answer not only has to be "N", but it can also be less than "N", so we can change our equation to:
    (K * (K+1))/2 <= N

    If we want to return "K", then what is stopping us from changing to equation so that one side contains "K"?
    (K * (K+1))/2 <= N
    (K * (K+1)) <= 2N
    K^2 + K <= 2N

    Complete the square:
    K^2 + K + 1/4 - 1/4 <= 2N
    (K + 1/2)^2 - 1/4 <= 2N
    (K + 1/2)^2 <= 2N + 1/4
    K + 1/2 <= sqrt(2N + 1/4)

    Our final equation:
    K <= sqrt(2N + 1/4) - 1/2
     */
    public int arrangeCoins2(int n) {
        return (int) (Math.sqrt(2 * (long) n + 0.25) - 0.5); // cast "n" to "long" to avoid integer overflow
    }
}
