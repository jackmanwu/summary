package interview.meituan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 对角线遍历
 * https://leetcode-cn.com/problems/diagonal-traverse/
 */
public class FindDiagonalOrder {
    /**
     * 迭代+翻转
     *
     * @param mat
     * @return
     */
    public int[] findDiagonalOrder(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows * cols];
        int k = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < rows + cols - 1; i++) {
            int r = 0;
            int c = i;
            if (i >= cols) {
                r = i - cols + 1;
                c = cols - 1;
            }
            list.clear();
            while (r < rows && c >= 0) {
                list.add(mat[r][c]);
                r++;
                c--;
            }
            if (i % 2 == 0) {
                Collections.reverse(list);
            }
            for (Integer num : list) {
                result[k++] = num;
            }
        }
        return result;
    }

    /**
     * 对角线正序遍历
     *
     * @param mat
     * @return
     */
    public int[] findDiagonalOrderV2(int[][] mat) {
        if (mat == null || mat.length == 0) {
            return new int[0];
        }
        int rows = mat.length;
        int cols = mat[0].length;
        int[] result = new int[rows * cols];
        int k = 0;
        for (int i = 0; i < rows + cols - 1; i++) {
            int r = 0;
            int c = i;
            if (i >= cols) {
                r = i - cols + 1;
                c = cols - 1;
            }
            while (r < rows && c >= 0) {
                result[k++] = mat[r][c];
                r++;
                c--;
            }
        }
        return result;
    }
}
