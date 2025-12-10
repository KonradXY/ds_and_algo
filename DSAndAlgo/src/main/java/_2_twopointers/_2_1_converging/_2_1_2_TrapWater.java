package _2_twopointers._2_1_converging;

public class _2_1_2_TrapWater {

    public int trap(int[] height) {
        int left = 0, right = height.length - 1;
        int leftMax = 0, rightMax = 0;
        int water = 0;

        while (left < right) {

            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    water += leftMax - height[left];
                }
                left++;

            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    water += rightMax - height[right];
                }
                right--;
            }
        }
        return water;
    }

    public int trap2(int[] arr) {
        int n = arr.length;
        int[] maxLeftHeight = new int[n];
        int[] maxRightHeight = new int[n];

        maxLeftHeight[0] = arr[0];
        for (int i = 1; i < n; i++) {
            maxLeftHeight[i] = Math.max(arr[i], maxLeftHeight[i - 1]);
        }

        maxRightHeight[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            maxRightHeight[i] = Math.max(arr[i], maxRightHeight[i + 1]);
        }

        int water = 0;
        for (int i = 0; i < n; i++)
            water += Math.min(maxLeftHeight[i], maxRightHeight[i]) - arr[i];

        return water;
    }
}
