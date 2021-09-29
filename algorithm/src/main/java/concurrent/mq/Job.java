package concurrent.mq;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CountDownLatch;

public class Job implements Runnable {
    private final List<Integer> data;
    private final CountDownLatch countDownLatch;
    private final CopyOnWriteArrayList<Integer> result;

    public Job(List<Integer> data, CopyOnWriteArrayList<Integer> result, CountDownLatch countDownLatch) {
        this.data = data;
        this.result = result;
        this.countDownLatch = countDownLatch;
    }

    @Override
    public void run() {
        int total = 0;
        for (Integer num : data) {
            total += num;
        }
        result.add(total);
        countDownLatch.countDown();
    }
}
