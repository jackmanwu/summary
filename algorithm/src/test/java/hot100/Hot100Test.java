package hot100;

import gaopin.ListNode;
import org.junit.Test;

public class Hot100Test {
    @Test
    public void testReverseList() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ReverseList reverseList = new ReverseList();
        print(head);
        ListNode newHead = reverseList.reverseListV2(head);
        print(newHead);
    }

    @Test
    public void testLRUCache() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 101);
        System.out.println(lruCache.get(1));
        lruCache.put(2, 102);
        System.out.println(lruCache.get(2));
        lruCache.put(3, 103);
        System.out.println(lruCache.get(1));
    }

    @Test
    public void testHasCycle() {
        HasCycle hasCycle = new HasCycle();
        ListNode node2 = new ListNode(2);
        node2.next = new ListNode(0, new ListNode(-4, node2));
        ListNode head = new ListNode(3, node2);
        boolean r = hasCycle.hasCycle(head);
        System.out.println(r);
    }

    @Test
    public void testAddTwoNumbers() {
        ListNode h1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        print(h1);
        ListNode h2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        print(h2);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode r = addTwoNumbers.addTwoNumbers(h1, h2);
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
