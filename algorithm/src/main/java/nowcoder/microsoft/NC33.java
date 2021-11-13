package nowcoder.microsoft;

import gaopin.ListNode;

/**
 * 合并两个排序的链表
 * https://www.nowcoder.com/practice/d8b6b4358f774294a89de2a6ac4d9337?tpId=117&&tqId=37735&&companyId=146&rp=1&ru=/company/home/code/146&qru=/ta/job-code-high/question-ranking
 */
public class NC33 {
    public ListNode merge(ListNode node1, ListNode node2) {
        ListNode head = new ListNode();
        ListNode current = head;
        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                current.next = node1;
                node1 = node1.next;
            } else {
                current.next = node2;
                node2 = node2.next;
            }
            current = current.next;
        }
        current.next = node1 != null ? node1 : node2;
        return head.next;
    }
}
