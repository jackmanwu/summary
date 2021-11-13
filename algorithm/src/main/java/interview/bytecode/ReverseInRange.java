package interview.bytecode;

import gaopin.ListNode;

/**
 * 字节教育-学浪
 * 指定范围内反转链表
 */
public class ReverseInRange {
    public ListNode reverseInRange(ListNode head, int m, int n) {
        ListNode newHead = new ListNode();
        ListNode cur = newHead;
        for (int i = 1; i < m; i++) {
            cur.next = head;
            cur = cur.next;
            head = head.next;
        }
        ListNode prev = null;
        ListNode headCur = head;
        for (int i = m; i <= n; i++) {
            if (headCur == null) {
                break;
            }
            ListNode next = headCur.next;
            headCur.next = prev;
            prev = headCur;
            headCur = next;
        }
        while (prev != null) {
            cur.next = prev;
            cur = cur.next;
            prev = prev.next;
        }
        while (headCur != null) {
            cur.next = headCur;
            cur = cur.next;
            headCur = headCur.next;
        }
        return newHead.next;
    }
}
