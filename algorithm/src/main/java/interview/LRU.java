package interview;

import java.util.HashMap;
import java.util.Map;

public class LRU {
    private Map<Integer, DLinkedNode> cache = new HashMap<>();
    private int capacity;
    private int size;
    private DLinkedNode head;
    private DLinkedNode tail;

    public LRU(int capacity) {
        this.capacity = capacity;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.val;
    }

    public void put(int key, int val) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            DLinkedNode newNode = new DLinkedNode(key, val);
            cache.put(key, newNode);
            addToHead(newNode);
            ++size;
            if (size > capacity) {
                DLinkedNode oldNode = removeTail();
                cache.remove(oldNode.key);
                --size;
            }
        } else {
            node.val = val;
            moveToHead(node);
        }
    }

    private void addToHead(DLinkedNode node) {
        node.next = head.next;
        node.prev = head;
        head.next.prev = node;
        head.next = node;
    }

    private DLinkedNode removeTail() {
        DLinkedNode node = tail.prev;
        removeNode(node);
        return node;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    private void removeNode(DLinkedNode node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    class DLinkedNode {
        int key;
        int val;
        DLinkedNode next;
        DLinkedNode prev;

        public DLinkedNode() {
        }

        public DLinkedNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
