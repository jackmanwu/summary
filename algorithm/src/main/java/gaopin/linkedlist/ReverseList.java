package gaopin.linkedlist;

import gaopin.ListNode;

/**
 * 反转链表
 */
public class ReverseList {
    /**
     * 遍历
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }

    /**
     * 递归
     *
     * @param head
     * @return
     */
    public ListNode reverseListV2(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode newHead = reverseListV2(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }
}
