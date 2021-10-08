package gaopin.jingdian;

/**
 * 最大子序和
 */
public class MaxSubArray {
    /**
     * 动态规划
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int prev = 0;
        int max = nums[0];
        for (int num : nums) {
            prev = Math.max(prev + num, num);
            max = Math.max(prev, max);
        }
        return max;
    }
}
