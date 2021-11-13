package hot100;

import gaopin.ListNode;

/**
 * 反转链表
 * https://leetcode-cn.com/problems/reverse-linked-list/
 */
public class ReverseList {
    /**
     * 迭代
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
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
