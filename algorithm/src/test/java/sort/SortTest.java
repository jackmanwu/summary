package sort;

import interview.mayiguoji.TopK;
import org.junit.Test;

public class SortTest {
    @Test
    public void testQuickSort() {
        QuickSort quickSort = new QuickSort();
        int[] r = quickSort.sortArray(new int[]{5, 1, 1, 2, 0, 0});
        for (int n : r) {
            System.out.print(n + " ");
        }
    }

    @Test
    public void testTopK() {
        int[] sales = {12, 2, 17, 8, 9};
        TopK topK = new TopK();
        int r = topK.topK(sales, 2);
        assert r == 12;
        int r2 = topK.topK(sales, 7);
        assert r2 == -1;
    }
}
