package interview;

import gaopin.ListNode;
import hot100.ReverseList;
import interview.bytecode.ReverseInRange;
import interview.huawei.MainEatingSpeed;
import interview.jinrishuiyinxiangji.MoveZeroes;
import interview.meituan.FindDiagonalOrder;
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

    @Test
    public void testFindDiagonalOrder() {
        FindDiagonalOrder findDiagonalOrder = new FindDiagonalOrder();
        int[][] nums = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[] r = findDiagonalOrder.findDiagonalOrder(nums);
        for (int n : r) {
            System.out.print(n + " ");
        }
    }

    @Test
    public void testReverseInRange() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseInRange reverseInRange = new ReverseInRange();
        ListNode newHead = reverseInRange.reverseInRange(head, 2, 4);
        while (newHead != null) {
            System.out.println(newHead.val);
            newHead = newHead.next;
        }
    }
}
