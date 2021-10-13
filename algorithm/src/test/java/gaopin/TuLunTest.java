package gaopin;

import gaopin.tulun.OrangesRotting;
import org.junit.Test;

public class TuLunTest {
    @Test
    public void testOrangeRotting() {
        OrangesRotting orangesRotting = new OrangesRotting();
        int[][] params = new int[][]{{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int r = orangesRotting.orangesRotting(params);
        System.out.println(r);
    }
}
