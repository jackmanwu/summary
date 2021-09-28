package gaopin;

/**
 * 接雨水
 */
public class Trap {
    /**
     * 暴力
     *
     * @param height
     * @return
     */
    public int trap(int[] height) {
        int total = 0;
        int size = height.length;
        for (int i = 1; i < size - 1; i++) {
            int maxLeft = 0;
            int maxRight = 0;
            for (int j = i; j >= 0; j--) {
                maxLeft = Math.max(maxLeft, height[j]);
            }
            for (int j = i; j < size; j++) {
                maxRight = Math.max(maxRight, height[j]);
            }
            total += Math.min(maxLeft, maxRight) - height[i];
        }
        return total;
    }

    /**
     * 动态编程，记录左右最大值，空间换时间
     *
     * @param height
     * @return
     */
    public int trapV2(int[] height) {
        int total = 0;
        int size = height.length;
        int[] maxLeft = new int[size];
        int[] maxRight = new int[size];
        maxLeft[0] = height[0];
        for (int i = 1; i < size; i++) {
            maxLeft[i] = Math.max(maxLeft[i - 1], height[i]);
        }
        maxRight[size - 1] = height[size - 1];
        for (int i = size - 2; i >= 0; i--) {
            maxRight[i] = Math.max(maxRight[i + 1], height[i]);
        }
        for (int i = 1; i < size - 1; i++) {
            total += Math.min(maxLeft[i], maxRight[i]) - height[i];
        }
        return total;
    }

    /**
     * 双指针
     *
     * @param height
     * @return
     */
    public int trapV3(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int total = 0;
        int leftMax = 0;
        int rightMax = 0;
        while (left < right) {
            if (height[left] < height[right]) {
                if (height[left] >= leftMax) {
                    leftMax = height[left];
                } else {
                    total += leftMax - height[left];
                }
                ++left;
            } else {
                if (height[right] >= rightMax) {
                    rightMax = height[right];
                } else {
                    total += rightMax - height[right];
                }
                --right;
            }
        }
        return total;
    }
}
