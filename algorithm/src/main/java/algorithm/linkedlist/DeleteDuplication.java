package algorithm.linkedlist;

/**
 * 删除重复节点
 */
public class DeleteDuplication {
    public ListNode deleteDuplication(ListNode pHead) {
        if (pHead == null || pHead.getNext() == null) {
            return pHead;
        }
        ListNode next = pHead.getNext();
        if (pHead.getVal().equals(next.getVal())) {
            while (next != null && pHead.getVal().equals(next.getVal())) {
                next = next.getNext();
            }
            return deleteDuplication(next);
        } else {
            pHead.setNext(deleteDuplication(pHead.getNext()));
            return pHead;
        }
    }
}
