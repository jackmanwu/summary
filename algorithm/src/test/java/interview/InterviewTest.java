package interview;

import interview.huawei.MainEatingSpeed;
import interview.jinrishuiyinxiangji.MoveZeroes;
import org.junit.Test;

public class InterviewTest {
    @Test
    public void testMainEatingSpeed() {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        MainEatingSpeed mainEatingSpeed = new MainEatingSpeed();
        int r = mainEatingSpeed.mainEatingSpeed(piles, h);
        System.out.println(r);
    }

    @Test
    public void testMoveZeroes() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
