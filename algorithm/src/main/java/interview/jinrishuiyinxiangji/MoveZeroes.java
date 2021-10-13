package interview.jinrishuiyinxiangji;

/**
 * 今日水印相机
 * <p>
 * 移动零
 */
public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int left = 0;
        int right = 0;
        while (right < len) {
            if (nums[right] != 0) {
                swap(nums, left, right);
                left++;
            }
            right++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
