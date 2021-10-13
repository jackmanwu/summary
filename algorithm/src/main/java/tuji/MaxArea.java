package tuji;

/**
 * 盛最多水的容器
 * https://leetcode-cn.com/problems/container-with-most-water/
 */
public class MaxArea {
    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int result = 0;
        while (l < r) {
            int area = Math.min(height[l], height[r]) * (r - l);
            result = Math.max(result, area);
            if (height[l] <= height[r]) {
                l++;
            } else {
                r--;
            }
        }
        return result;
    }
}
