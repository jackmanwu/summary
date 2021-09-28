package gaopin;

/**
 * 合并两个有序数组
 */
public class Merge {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        while (n > 0) {
            nums1[m + n - 1] = m < 1 || nums2[n - 1] > nums1[m - 1] ? nums2[--n] : nums1[--m];
        }
    }
}
