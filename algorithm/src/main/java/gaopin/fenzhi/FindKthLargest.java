package gaopin.fenzhi;

import java.util.concurrent.ThreadLocalRandom;

/**
 * 数组中的第K个最大元素
 */
public class FindKthLargest {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, 0, nums.length - 1, nums.length - k);
    }

    private int quickSelect(int[] nums, int l, int r, int k) {
        int pos = randomPartition(nums, l, r);
        if (pos == k) {
            return nums[pos];
        } else {
            return k < pos ? quickSelect(nums, l, pos - 1, k) : quickSelect(nums, pos + 1, r, k);
        }
    }

    private int randomPartition(int[] nums, int l, int r) {
        int i = ThreadLocalRandom.current().nextInt(r - l + 1) + l;
        swap(nums, i, r);
        return partition(nums, l, r);
    }

    private int partition(int[] nums, int l, int r) {
        int x = nums[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (nums[j] <= x) {
                swap(nums, ++i, j);
            }
        }
        swap(nums, i + 1, r);
        return i + 1;
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
