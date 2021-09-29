package sort;

public class HeapSort {
    public int[] sortArray(int[] nums) {
        heapSort(nums);
        return nums;
    }

    public void heapSort(int[] nums) {

    }

    public void buildMaxHeap(int[] nums, int len) {

    }

    public void maxHeapify(int[] nums, int i, int len) {

    }

    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
