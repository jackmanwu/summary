package gaopin;

import gaopin.linkedlist.*;
import org.junit.Test;

public class LinkedListTest {
    @Test
    public void testReverseList() {
        ListNode head = new ListNode(10, new ListNode(2, new ListNode(5, new ListNode(9, new ListNode(11)))));
        print(head);
        ReverseList reverseList = new ReverseList();
        ListNode newHead = reverseList.reverseListV2(head);
        print(newHead);
    }

    @Test
    public void testAddTwoNumbers() {
//        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
//        ListNode l1 = new ListNode(0);
//        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
//        ListNode l2 = new ListNode(0);
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode r = addTwoNumbers.addTwoNumbers(l1, l2);
        print(r);
    }

    @Test
    public void testMergeTwoLists() {
        ListNode l1 = new ListNode(1, new ListNode(10, new ListNode(14, new ListNode(16))));
        ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        MergeTwoLists mergeTwoLists = new MergeTwoLists();
        ListNode head = mergeTwoLists.mergeTwoListsV2(l1, l2);
        print(head);
    }

    @Test
    public void testLengthOfLongestSubstring() {
        String s = "pwwkew";
        LengthOfLongestSubstring lengthOfLongestSubstring = new LengthOfLongestSubstring();
        int r = lengthOfLongestSubstring.lengthOfLongestSubstring(s);
        System.out.println(r);
    }

    @Test
    public void testRemoveNthFromEnd() {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        print(head);
        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
        ListNode newHead = removeNthFromEnd.removeNthFromEndV3(head, 3);
        System.out.println(newHead.val);
        print(newHead);
    }

    private void print(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
}
