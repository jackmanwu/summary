package nowcoder.tencent;

import java.util.Random;

/**
 * 寻找第K大
 * https://www.nowcoder.com/practice/e016ad9b7f0b45048c58a9f27ba618bf?tpId=117&&tqId=37791&&companyId=138&rp=1&ru=/company/home/code/138&qru=/ta/job-code-high/question-ranking
 */
public class NC88 {
    public int findKth(int[] a, int n, int k) {
        return quickSelect(a, 0, n - 1, n - k);
    }

    private int quickSelect(int[] a, int l, int r, int k) {
        int p = randomPartition(a, l, r);
        if (p == k) {
            return a[p];
        }
        if (k < p) {
            return quickSelect(a, l, p - 1, k);
        } else {
            return quickSelect(a, p + 1, r, k);
        }
    }

    private int randomPartition(int[] a, int l, int r) {
        int p = new Random().nextInt(r - l + 1) + l;
        swap(a, p, r);
        return partition(a, l, r);
    }

    private int partition(int[] a, int l, int r) {
        int x = a[r];
        int i = l - 1;
        for (int j = l; j < r; j++) {
            if (a[j] <= x) {
                swap(a, ++i, j);
            }
        }
        swap(a, i + 1, r);
        return i + 1;
    }

    private void swap(int[] a, int i, int j) {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
