package gaopin;

import gaopin.dynamic.ClimbStairs;
import gaopin.dynamic.MinPathSum;
import org.junit.Test;

public class DynamicTest {
    @Test
    public void testClimbStairs() {
        ClimbStairs climbStairs = new ClimbStairs();
        int r = climbStairs.climbStairs(3);
        System.out.println(r);
    }

    @Test
    public void testMinPathSum() {
        MinPathSum minPathSum = new MinPathSum();
//        int[][] grid = new int[][]{{1, 3, 1}, {1, 5, 1}, {4, 2, 1}};
        int[][] grid = new int[][]{{1, 2, 3}, {4, 5, 6}};
        int r = minPathSum.minPathSum(grid);
        System.out.println(r);
    }
}
