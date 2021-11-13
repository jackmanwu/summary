package microsoft;

import java.util.HashMap;
import java.util.Map;

public class CopyRandomList {
    private Map<Node, Node> cache = new HashMap<>();

    public Node copyRandomList(Node head) {
        if (head == null) {
            return null;
        }
        if (!cache.containsKey(head)) {
            Node newHead = new Node(head.val);
            cache.put(head, newHead);
            newHead.next = copyRandomList(head.next);
            newHead.random = copyRandomList(head.random);
        }
        return cache.get(head);
    }

    public static class Node {
        int val;
        Node next;
        Node random;

        public Node(int val) {
            this.val = val;
        }
    }
}
