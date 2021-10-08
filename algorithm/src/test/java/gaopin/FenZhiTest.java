package gaopin;

import gaopin.fenzhi.FindKthLargest;
import org.junit.Test;

public class FenZhiTest {
    @Test
    public void testFindKthLargest() {
//        int[] nums = {3, 2, 1, 5, 6, 4};
        int[] nums = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        FindKthLargest findKthLargest = new FindKthLargest();
        int r = findKthLargest.findKthLargest(nums, 4);
        System.out.println(r);
    }
}
