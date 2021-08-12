package algorithm.linkedlist;

import org.junit.Test;

public class LinkedListTest {
    @Test
    public void testPrintTailToHead() {
        ListNode head = build();
        PrintTailToHead printTailToHead = new PrintTailToHead();

        printTailToHead.print(head).forEach(System.out::println);
//        System.out.println("--------");
//        printTailToHead.print2(head).forEach(System.out::println);
        System.out.println("--------");
        printTailToHead.print3(head).forEach(System.out::println);
    }

    @Test
    public void testReverse() {
        ListNode head = build();
        ReverseList reverseList = new ReverseList();
//        ListNode neaHead = reverseList.reverse(head);
        ListNode neaHead = reverseList.reverse2(head).getNext();
        while (neaHead != null) {
            System.out.println(neaHead.getVal());
            neaHead = neaHead.getNext();
        }
    }

    private ListNode build() {
        ListNode tail = new ListNode(10, null);
        ListNode mid1 = new ListNode(20, tail);
        ListNode mid2 = new ListNode(40, mid1);
        ListNode mid3 = new ListNode(30, mid2);
        ListNode head = new ListNode(50, mid3);
        return head;
    }
}
