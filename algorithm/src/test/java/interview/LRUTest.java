package interview;

import org.junit.Test;

public class LRUTest {
    @Test
    public void testLRU() {
        LRU lru = new LRU(3);
        lru.put(1, 100);
        System.out.println(lru.get(1));
        lru.put(2, 200);
        lru.put(3, 300);
        lru.put(4, 400);
        System.out.println(lru.get(4));
        System.out.println(lru.get(1));
        lru.put(5, 500);
        System.out.println(lru.get(2));
        System.out.println(lru.get(3));
    }
}
