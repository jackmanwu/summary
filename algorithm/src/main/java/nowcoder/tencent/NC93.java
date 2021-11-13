package nowcoder.tencent;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 设计LRU缓存结构
 * https://www.nowcoder.com/practice/e3769a5f49894d49b871c09cadd13a61?tpId=117&&tqId=37804&&companyId=138&rp=1&ru=/company/home/code/138&qru=/ta/job-code-high/question-ranking
 */
public class NC93 {
    private Map<Integer, DLinkedNode> cache = new HashMap<>();
    private int size;
    private int capacity;
    private DLinkedNode head;
    private DLinkedNode tail;

    public NC93(int capacity) {
        this.capacity = capacity;
        head = new DLinkedNode();
        tail = new DLinkedNode();
        head.next = tail;
        tail.prev = head;
    }

    public int[] LRU(int[][] operators, int k) {
        NC93 nc93 = new NC93(k);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < operators.length; i++) {
            int opt = operators[i][0];
            int key = operators[i][1];
            int val = 0;
            if (operators[i].length > 2) {
                val = operators[i][2];
            }
            if (opt == 1) {
                nc93.set(key, val);
            } else if (opt == 2) {
                list.add(nc93.get(key));
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int[] nums = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }

    public int get(int key) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            return -1;
        }
        moveToHead(node);
        return node.val;
    }

    public void set(int key, int val) {
        DLinkedNode node = cache.get(key);
        if (node == null) {
            DLinkedNode newNode = new DLinkedNode(key, val);
            cache.put(key, newNode);
            addToHead(newNode);
            ++size;
            if (size > capacity) {
                DLinkedNode old = removeTail();
                cache.remove(old.key);
                --size;
            }
        } else {
            node.val = val;
            moveToHead(node);
        }
    }

    private void addToHead(DLinkedNode node) {
        node.prev = head;
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
    }

    private DLinkedNode removeTail() {
        DLinkedNode node = tail.prev;
        removeNode(node);
        return node;
    }

    private void removeNode(DLinkedNode node) {
        node.next.prev = node.prev;
        node.prev.next = node.next;
    }

    private void moveToHead(DLinkedNode node) {
        removeNode(node);
        addToHead(node);
    }

    class DLinkedNode {
        int key;
        int val;
        DLinkedNode prev;
        DLinkedNode next;

        DLinkedNode() {
        }

        DLinkedNode(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
}
