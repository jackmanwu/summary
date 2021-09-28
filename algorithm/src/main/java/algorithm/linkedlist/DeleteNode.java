package algorithm.linkedlist;

/**
 * 在O(1)时间内删除节点
 */
public class DeleteNode {
    public ListNode deleteNode(ListNode head, ListNode tobeDelete) {
        if (head == null || tobeDelete == null) {
            return null;
        }
        if (tobeDelete.getNext() != null) {
            ListNode next = tobeDelete.getNext();
            tobeDelete.setVal(next.getVal());
            tobeDelete.setNext(next.getNext());
        } else {
            if (head == tobeDelete) {
                head = null;
            } else {
                ListNode cur = head;
                while (cur.getNext() != tobeDelete) {
                    cur = cur.getNext();
                }
                cur.setNext(null);
            }
        }
        return head;
    }
}
