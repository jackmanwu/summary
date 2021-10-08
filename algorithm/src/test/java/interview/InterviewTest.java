package interview;

import interview.huawei.MainEatingSpeed;
import org.junit.Test;

public class InterviewTest {
    @Test
    public void testMainEatingSpeed(){
        int[] piles = {3,6,7,11};
        int h = 8;
        MainEatingSpeed mainEatingSpeed = new MainEatingSpeed();
       int r = mainEatingSpeed.mainEatingSpeed(piles,h);
        System.out.println(r);
    }
}
