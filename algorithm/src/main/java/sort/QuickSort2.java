package sort;

import java.util.Random;

public class QuickSort2 {
    public int[] sortArray(int[] nums) {
        randomQuickSort(nums, 0, nums.length - 1);
        return nums;
    }

    private void randomQuickSort(int[] nums, int l, int r) {
        if (l < r) {
            int p = randomPartition(nums, l, r);
            randomQuickSort(nums, l, p - 1);
            randomQuickSort(nums, p + 1, r);
        }
    }

    private int randomPartition(int[] nums, int l, int r) {
        int i = new Random().nextInt(r - l + 1) + l;
        swap(nums, i, r);
        return partition(nums, l, r);
    }

    private int partition(int[] nums, int l, int r) {
        int p = nums[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (nums[j] <= p) {
                i++;
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
