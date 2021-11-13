package nowcoder.tencent;

import gaopin.ListNode;

/**
 * 反转链表
 * https://www.nowcoder.com/practice/75e878df47f24fdc9dc3e400ec6058ca?tpId=117&&tqId=37777&&companyId=138&rp=1&ru=/company/home/code/138&qru=/ta/job-code-high/question-ranking
 */
public class NC78 {
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
}
