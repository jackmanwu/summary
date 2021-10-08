package gaopin.linkedlist;

import gaopin.ListNode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * 删除链表的倒数第N个节点
 */
public class RemoveNthFromEnd {
    /**
     * 计算链表长度
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode start = new ListNode(0, head);
        ListNode tmp = start;
        int len = getLength(head);
        for (int i = 1; i < len - n + 1; i++) {
            tmp = tmp.next;
        }
        tmp.next = tmp.next.next;
        return start.next;
    }

    private int getLength(ListNode head) {
        int length = 0;
        while (head != null) {
            ++length;
            head = head.next;
        }
        return length;
    }

    /**
     * 栈
     *
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEndV2(ListNode head, int n) {
        ListNode start = new ListNode(0, head);
        ListNode tmp = start;
        Deque<ListNode> stack = new LinkedList<>();
        while (tmp != null) {
            stack.push(tmp);
            tmp = tmp.next;
        }
        for (int i = 0; i < n; i++) {
            stack.pop();
        }
        ListNode prev = stack.peek();
        if (prev != null) {
            prev.next = prev.next.next;
        }
        return start.next;
    }

    /**
     * 双指针
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEndV3(ListNode head, int n) {
        ListNode start = new ListNode(0, head);
        ListNode first = head;
        ListNode second = start;
        for (int i = 0; i < n; i++) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        return start.next;
    }
}
