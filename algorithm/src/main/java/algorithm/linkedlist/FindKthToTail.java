package algorithm.linkedlist;

/**
 * 倒数第K个节点
 */
public class FindKthToTail {
    public ListNode findKthToTail(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode p1 = head;
        while (p1 != null && k-- > 0) {
            p1 = p1.getNext();
        }
        if (k > 0) {
            return null;
        }
        ListNode p2 = head;
        while (p1 != null) {
            p1 = p1.getNext();
            p2 = p2.getNext();
        }
        return p2;
    }
}
