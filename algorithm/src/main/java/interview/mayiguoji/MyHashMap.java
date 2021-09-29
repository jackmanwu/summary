package interview.mayiguoji;

import java.util.Objects;

/**
 * 手撕红黑树
 * @param <K>
 * @param <V>
 */
public class MyHashMap<K, V> {
    private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;
    private static final int MAX_CAPACITY = 1 << 30;

    private transient Node<K, V>[] data;
    private transient int size;
    private int capacity;
    private final float loadFactor;
    private int threshold;

    public MyHashMap() {
        this.capacity = DEFAULT_CAPACITY;
        this.loadFactor = DEFAULT_LOAD_FACTOR;
        this.threshold = (int) (capacity * loadFactor);
    }

    public MyHashMap(int capacity, float loadFactor) {
        this.capacity = ensureCapacity(capacity);
        this.loadFactor = loadFactor;
        this.threshold = (int) (capacity * loadFactor);
    }

    public V put(K key, V value) {
        if (data == null || data.length == 0) {
            data = new Node[capacity];
        }
        int hash = hash(key);
        int index = (capacity - 1) & hash;
        Node<K, V> current = data[index];
        if (current == null) {
            data[index] = new Node<>(key, value, null, hash);
        } else {
            //遍历桶上的链表，如果存在则覆盖旧值，不存在尾部新增节点
            while (true) {
                //查找是否存在该节点
                if (current.hash == hash && (Objects.equals(key, current.key))) {
                    V oldValue = current.value;
                    current.value = value;
                    return oldValue;
                }
                if (current.next == null) {
                    current.next = new Node<>(key, value, null, hash);
                    break;
                }
                current = current.next;
            }
        }
        ++size;
        if (size > threshold) {
            //达到负载因子，需扩容
            resize();
        }
        return null;
    }

    public V get(K key) {
        int hash = hash(key);
        if (data == null || data.length == 0) {
            return null;
        }
        Node<K, V> current = data[(capacity - 1) & hash];
        if (current == null) {
            return null;
        }
        while (current != null) {
            //遍历链表
            if (current.hash == hash && (Objects.equals(key, current.key))) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    private void resize() {
        int newCapacity = capacity << 1;
        if (newCapacity > MAX_CAPACITY) {
            threshold = Integer.MAX_VALUE;
            return;
        }
        int oldCapacity = capacity;
        capacity = newCapacity;
        Node<K, V>[] newData = new Node[capacity];
        for (int i = 0; i < capacity; i++) {
            Node<K, V> current = data[i];
            if (current == null) {
                continue;
            }
            if (current.next == null) {
                newData[current.hash & (capacity - 1)] = current;
            } else {
                //高低链表移动
                Node<K, V> lowerHead = null, lowerTail = null;
                Node<K, V> highHead = null, highTail = null;
                while (current != null) {
                    if ((current.hash & oldCapacity) == 0) {
                        if (lowerTail == null) {
                            lowerHead = current;
                        } else {
                            lowerTail.next = current;
                        }
                        lowerTail = current;
                    } else {
                        if (highTail == null) {
                            highHead = current;
                        } else {
                            highTail.next = current;
                        }
                        highTail = current;
                    }
                    current = current.next;
                }
                if (lowerTail != null) {
                    lowerTail.next = null;
                    newData[i] = lowerHead;
                }
                if (highTail != null) {
                    highTail.next = null;
                    newData[i + oldCapacity] = highHead;
                }
            }
        }
        data = newData;
    }

    private int ensureCapacity(int capacity) {
        //保证容量是2的幂，左移并异或保证低位均为1，最后得到的是全部为1的整数，再+1即得到2的幂
        int temp = capacity - 1;
        temp |= temp >>> 1;
        temp |= temp >>> 2;
        temp |= temp >>> 4;
        temp |= temp >>> 8;
        temp |= temp >>> 16;
        return temp < 0 ? 1 : (temp > MAX_CAPACITY ? MAX_CAPACITY : temp + 1);
    }

    private int hash(Object key) {
        if (key == null) {
            return 0;
        }
        int h = key.hashCode();
        return h ^ (h >>> 16);
    }

    static class Node<K, V> {
        K key;
        V value;
        Node<K, V> next;
        int hash;

        Node(K key, V value, Node<K, V> next, int hash) {
            this.key = key;
            this.value = value;
            this.next = next;
            this.hash = hash;
        }
    }
}
