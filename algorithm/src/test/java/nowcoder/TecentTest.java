package nowcoder;

import gaopin.ListNode;
import gaopin.TreeNode;
import nowcoder.microsoft.NC19;
import nowcoder.microsoft.NC33;
import nowcoder.microsoft.NC68;
import nowcoder.tencent.*;
import org.junit.Test;

public class TecentTest {
    @Test
    public void testNC140() {
        NC140 nc140 = new NC140();
        int[] r = nc140.sort(new int[]{2, 0, 1, 3, 9, 10, 1});
        for (int num : r) {
            System.out.println(num);
        }
    }

    @Test
    public void testNC93() {
        int k = 3;
        NC93 nc93 = new NC93(k);
        int[][] param = new int[][]{{1, 1, 1}, {1, 2, 2}, {1, 3, 2}, {2, 1}, {1, 4, 4}, {2, 2}};
        int[] r = nc93.LRU(param, k);
        for (int num : r) {
            System.out.print(num + " ");
        }
    }

    @Test
    public void testNC45() {
        NC45 nc45 = new NC45();
        TreeNode treeNode = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        int[][] r = nc45.threeOrders(treeNode);
        for (int[] ints : r) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testNC88() {
        NC88 nc88 = new NC88();
        int[] param = new int[]{10, 10, 9, 9, 8, 7, 5, 6, 4, 3, 4, 2};
        int r = nc88.findKth(param, param.length, 3);
        System.out.println(r);
    }

    @Test
    public void testNC4() {
        NC4 nc4 = new NC4();
        ListNode head = new ListNode();
        ListNode head1 = new ListNode(2);
        ListNode head2 = new ListNode(5);
        ListNode head3 = new ListNode(8);
        ListNode head4 = new ListNode(3);
        head.next = head1;
        head1.next = head2;
        head2.next = head3;
        head3.next = head4;
        head4.next = head2;

        boolean r = nc4.hasCycle(head);
        System.out.println(r);
    }

    @Test
    public void testNC33() {
        NC33 nc33 = new NC33();
        ListNode node1 = new ListNode(1, new ListNode(3, new ListNode(5)));
        ListNode node2 = new ListNode(2, new ListNode(4, new ListNode(6)));
        ListNode head = nc33.merge(node1, node2);
        print(head);
    }

    @Test
    public void testNC68(){
        NC68 nc68 = new NC68();
        int r = nc68.jumpFloor(7);
        System.out.println(r);
    }

    @Test
    public void testNC19(){
        NC19 nc19 =new NC19();
        int r = nc19.findGreatestSumOfSubArray(new int[]{1,-2,3,10,-4,7,2,-5});
        System.out.println(r);
    }

    private void print(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
        System.out.println();
    }
}
