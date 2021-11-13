package nowcoder.tencent;

import java.util.Random;

/**
 * 快排
 * https://www.nowcoder.com/practice/2baf799ea0594abd974d37139de27896?tpId=117&&tqId=37851&&companyId=138&rp=1&ru=/company/home/code/138&qru=/ta/job-code-high/question-ranking
 */
public class NC140 {
    public int[] sort(int[] arr) {
        quickSort(arr, 0, arr.length - 1);
        return arr;
    }

    private void quickSort(int[] arr, int l, int r) {
        if (l < r) {
            int p = randomPartition(arr, l, r);
            quickSort(arr, l, p - 1);
            quickSort(arr, p + 1, r);
        }
    }

    private int randomPartition(int[] arr, int l, int r) {
        int p = new Random().nextInt(r - l + 1) + l;
        swap(arr, p, r);
        return partition(arr, l, r);
    }

    private int partition(int[] arr, int l, int r) {
        int x = arr[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (arr[j] <= x) {
                swap(arr, ++i, j);
            }
        }
        swap(arr, i + 1, r);
        return i + 1;
    }

    private void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
