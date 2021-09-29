package concurrent.mq;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

public class JobContext {
    private final int count;
    private final CountDownLatch countDownLatch;
    private final CopyOnWriteArrayList<Integer> result;

    public JobContext(int count) {
        this.count = count;
        this.countDownLatch = new CountDownLatch(count);
        this.result = new CopyOnWriteArrayList<>();
    }

    public int parallelHandle(List<Integer> list) throws InterruptedException {
        List<List<Integer>> data = partition(list, count);
        for (List<Integer> pData : data) {
            new Thread(new Job(pData, result, countDownLatch)).start();
        }
        countDownLatch.await();
        System.out.println("处理完成" + result);
        int sum = 0;
        for (Integer re : result) {
            sum += re;
        }
        return sum;
    }

    private List<List<Integer>> partition(List<Integer> list, int n) {
        List<List<Integer>> newList = new ArrayList<>(n);
        int size = list.size();
        int averageCount = size / n;
        int remainCount = size % n;
        int start = 0;
        for (int i = 0; i < n; i++) {
            List<Integer> data = list.subList(start, start + averageCount);
            start += averageCount;
            newList.add(data);
        }
        for (int i = 0; i < remainCount; i++) {
            Integer d = list.get(start++);
            List<Integer> newArr = new ArrayList<>(newList.get(i));
            newArr.add(d);
            newList.set(i, newArr);
        }
        System.out.println(newList);
        return newList;
    }
}
