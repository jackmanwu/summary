package interview.mayiguoji;

import java.util.Random;

/**
 * 第K大问题
 */
public class TopK {
    public int topK(int[] nums, int k) {
        if (k >= nums.length) {
            return -1;
        }
        //快排
        randomizedQuicksort(nums, 0, nums.length - 1, k);
        return nums[k - 1];
    }

    private void randomizedQuicksort(int[] nums, int l, int r, int k) {
        if (l >= r) {
            return;
        }
        int pos = randomizedPartition(nums, l, r);
        int num = pos - l + 1;
        if (k != num) {
            if (k < num) {
                randomizedQuicksort(nums, l, pos - 1, k);
            } else {
                randomizedQuicksort(nums, pos + 1, r, k - num);
            }
        }
    }

    private int randomizedPartition(int[] nums, int l, int r) {
        int i = new Random().nextInt(r - l + 1) + l;
        swap(nums, r, i);
        return partition(nums, l, r);
    }

    private int partition(int[] nums, int l, int r) {
        int pivot = nums[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (nums[j] > pivot) {
                i += 1;
                swap(nums, i, j);
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
