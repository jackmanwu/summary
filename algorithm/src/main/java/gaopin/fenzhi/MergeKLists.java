package gaopin.fenzhi;

import gaopin.ListNode;

import java.util.PriorityQueue;

/**
 * 合并K个排序链表
 */
public class MergeKLists {
    /**
     * 顺序合并
     *
     * @param lists
     * @return
     */
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode newHead = null;
        for (ListNode head : lists) {
            newHead = mergeTwoLists(newHead, head);
        }
        return newHead;
    }

    /**
     * 分置合并
     *
     * @param lists
     * @return
     */
    public ListNode mergeKListsV2(ListNode[] lists) {
        return merge(lists, 0, lists.length - 1);
    }

    public ListNode mergeKListsV3(ListNode[] lists) {
        PriorityQueue<Status> queue = new PriorityQueue<>();
        for (ListNode listNode : lists) {
            if (listNode != null) {
                queue.offer(new Status(listNode));
            }
        }
        ListNode head = new ListNode(-1);
        ListNode tail = head;
        while (!queue.isEmpty()) {
            Status status = queue.poll();
            tail.next = status.listNode;
            tail = tail.next;
            if (status.listNode.next != null) {
                queue.offer(new Status(status.listNode.next));
            }
        }
        return head.next;
    }

    private ListNode merge(ListNode[] lists, int l, int r) {
        if (l == r) {
            return lists[l];
        }
        if (l > r) {
            return null;
        }
        int mid = (l + r) >> 1;
        return mergeTwoLists(merge(lists, l, mid), merge(lists, mid + 1, r));
    }

    private ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if (node1 == null) {
            return node2;
        }
        if (node2 == null) {
            return node1;
        }
        ListNode newHead = new ListNode(-1);
        ListNode prev = newHead;
        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                prev.next = node1;
                node1 = node1.next;
            } else {
                prev.next = node2;
                node2 = node2.next;
            }
            prev = prev.next;
        }
        prev.next = node1 != null ? node1 : node2;
        return newHead.next;
    }

    static class Status implements Comparable<Status> {
        ListNode listNode;

        Status(ListNode listNode) {
            this.listNode = listNode;
        }

        @Override
        public int compareTo(Status o) {
            return this.listNode.val - o.listNode.val;
        }
    }
}
