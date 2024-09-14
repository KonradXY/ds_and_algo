package _2_twopointers;

public class _6_ContainerWithMostWater {
    /**
     You are given an integer array height of length n.
     There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).
     Find two lines that together with the x-axis form a container, such that the container contains the most water.
     Return the maximum amount of water a container can store.
     Notice that you may not slant the container.
     */

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int maxArea = 0;

        while (left < right) {
            int currentArea = Math.min(height[left], height[right]) * (right - left);
            maxArea = Math.max(maxArea, currentArea);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
    }

    /**
     SPIEGAZIONE
     The two-pointer technique starts with the widest container and moves the pointers inward based on the comparison of heights.
     Increasing the width of the container can only lead to a larger area if the height of the new boundary is greater.
     By moving the pointers towards the center, we explore containers with the potential for greater areas.
     */
}
