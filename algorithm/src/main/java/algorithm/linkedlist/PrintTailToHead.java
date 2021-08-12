package algorithm.linkedlist;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 从尾到头打印链表
 */
public class PrintTailToHead {
    /**
     * 递归
     *
     * @param listNode
     * @return
     */
    public List<Integer> print(ListNode listNode) {
        List<Integer> values = new ArrayList<>();
        if (listNode != null) {
            values.addAll(print(listNode.getNext()));
            values.add(listNode.getVal());
        }
        return values;
    }

    /**
     * 头插法
     *
     * @param listNode
     * @return
     */
    public List<Integer> print2(ListNode listNode) {
        ListNode head = new ListNode(-1, null);
        while (listNode != null) {
            ListNode tmp = listNode.getNext();
            listNode.setNext(head.getNext());
            head.setNext(listNode);
            listNode = tmp;
        }
        List<Integer> values = new ArrayList<>();
        head = head.getNext();
        while (head != null) {
            values.add(head.getVal());
            head = head.getNext();
        }
        return values;
    }

    /**
     * 使用栈，后进先出
     *
     * @param listNode
     * @return
     */
    public List<Integer> print3(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.add(listNode.getVal());
            listNode = listNode.getNext();
        }
        List<Integer> values = new ArrayList<>();
        while (!stack.isEmpty()) {
            values.add(stack.pop());
        }
        return values;
    }
}
