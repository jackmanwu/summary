package tuji;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int len = nums.length;
        int l = 0;
        int r = 0;
        while (r < len) {
            if (nums[r] != 0) {
                swap(nums, l, r);
                l++;
            }
            r++;
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
