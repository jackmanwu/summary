import gaopin.ListNode;
import org.junit.Test;
import tuji.*;

import java.util.List;

public class TuJiTest {
    @Test
    public void testTwoSum() {
        TwoSum twoSum = new TwoSum();
        int[] nums = new int[]{2, 7, 11, 15};
        int target = 9;
        int[] r = twoSum.twoSum(nums, target);
        for (int i : r) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void testMaxArea() {
        int[] height = new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7};
        MaxArea maxArea = new MaxArea();
        int r = maxArea.maxArea(height);
        System.out.println(r);
        assert r == 49;
    }

    @Test
    public void testThreeSum() {
        int[] nums = new int[]{-1, 0, 1, 2, -1, -4};
        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> r = threeSum.threeSum(nums);
        for (List<Integer> list : r) {
            System.out.println(list);
        }
    }

    @Test
    public void testRemoveDuplicates() {
        int[] nums = new int[]{1, 1, 2};
        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        int r = removeDuplicates.removeDuplicates(nums);
        System.out.println(r);
        assert r == 2;
    }

    @Test
    public void testNextPermutation() {
        NextPermutation nextPermutation = new NextPermutation();
//        int[] nums = new int[]{1, 2, 3};
        int[] nums = new int[]{3, 2, 1};
        nextPermutation.nextPermutation(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    @Test
    public void testSearch() {
        Search search = new Search();
//        int[] nums = new int[]{4, 5, 6, 7, 0, 1, 2};
        int[] nums = new int[]{5, 1, 3};
        int target = 3;
        int r = search.search(nums, target);
        System.out.println(r);
//        assert r == 4;
    }

    @Test
    public void testMoveZeroes() {
        MoveZeroes moveZeroes = new MoveZeroes();
        int[] nums = new int[]{0, 1, 0, 3, 12};
        moveZeroes.moveZeroes(nums);
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    @Test
    public void testReverseList() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        print(head);
        ReverseList reverseList = new ReverseList();
        ListNode newHead = reverseList.reverseList(head);
        print(newHead);
    }

    private void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
