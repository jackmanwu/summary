package algorithm.linkedlist;

/**
 * 反转链表
 */
public class ReverseList {
    /**
     * 递归
     *
     * @param listNode
     * @return
     */
    public ListNode reverse(ListNode listNode) {
        if (listNode == null || listNode.getNext() == null) {
            return listNode;
        }
        ListNode next = listNode.getNext();
        listNode.setNext(null);
        ListNode node = reverse(next);
        next.setNext(listNode);
        return node;
    }

    /**
     * 头插法
     *
     * @param listNode
     * @return
     */
    public ListNode reverse2(ListNode listNode) {
        ListNode newNode = new ListNode(-1, null);
        while (listNode != null) {
            ListNode next = listNode.getNext();
            listNode.setNext(newNode.getNext());
            newNode.setNext(listNode);
            listNode = next;
        }
        return newNode;
    }
}
