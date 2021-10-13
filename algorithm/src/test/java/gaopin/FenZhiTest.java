package gaopin;

import gaopin.fenzhi.FindKthLargest;
import gaopin.fenzhi.MergeKLists;
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

    @Test
    public void testMergeKLists() {
        ListNode[] lists = new ListNode[]{
                new ListNode(1, new ListNode(4, new ListNode(5))),
                new ListNode(1, new ListNode(3, new ListNode(4))),
                new ListNode(2, new ListNode(6))
        };
        MergeKLists mergeKLists = new MergeKLists();
        ListNode r = mergeKLists.mergeKListsV3(lists);
        print(r);
    }

    private void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
