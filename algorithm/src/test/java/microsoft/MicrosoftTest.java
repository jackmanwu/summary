package microsoft;

import org.junit.Test;

public class MicrosoftTest {
    @Test
    public void testCopyRandomList() {
        CopyRandomList copyRandomList = new CopyRandomList();
        CopyRandomList.Node head = new CopyRandomList.Node(7);
        CopyRandomList.Node node1 = new CopyRandomList.Node(13);
        node1.random = head;
        CopyRandomList.Node node2 = new CopyRandomList.Node(11);
        CopyRandomList.Node node3 = new CopyRandomList.Node(10);
        CopyRandomList.Node node4 = new CopyRandomList.Node(1);
        node2.random = node4;
        node3.random = node2;
        node4.random = head;
        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        CopyRandomList.Node node = copyRandomList.copyRandomList(head);
        while (node != null) {
            System.out.print(node.val + "-" + (node.random != null ? node.random.val : "null") + "  ");
            node = node.next;
        }
    }
}
