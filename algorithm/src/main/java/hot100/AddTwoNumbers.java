package hot100;

import gaopin.ListNode;

/**
 * 两数相加
 * https://leetcode-cn.com/problems/add-two-numbers/
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int remainder = 0;
        ListNode newHead = new ListNode();
        ListNode cur = newHead;
        while (l1 != null || l2 != null) {
            int n1 = l1 == null ? 0 : l1.val;
            int n2 = l2 == null ? 0 : l2.val;
            int n = n1 + n2 + remainder;
            remainder = n / 10;
            ListNode node = new ListNode(n % 10);
            cur.next = node;
            cur = node;
            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        if (remainder > 0) {
            cur.next = new ListNode(remainder);
        }
        return newHead.next;
    }
}
