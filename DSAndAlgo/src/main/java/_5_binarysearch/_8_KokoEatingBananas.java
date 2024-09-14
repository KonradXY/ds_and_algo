package _5_binarysearch;

import java.util.Arrays;

public class _8_KokoEatingBananas {

    public int minEatingSpeed(int[] piles, int h) {
        int right = Arrays.stream(piles).max().getAsInt();
        int left = 1;
        int target = -1;
        while (left < right) {
            target = left + (right - left) / 2;
            int hourSpent = eatBananas(piles, target);
            if (hourSpent <= h) {
                right = target;
            } else {
                left = target + 1;
            }
        }
        return target;
    }

    private int eatBananas(int[] piles, int target) {
        return Arrays.stream(piles).map(pile -> (int) Math.ceil((double) pile / target)).sum();
    }




}
