package concurrent;

import concurrent.mq.LockConditionModel;
import concurrent.mq.TaskService;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

public class ConcurrentTest {
    @Test
    public void testMQ() {
        TaskService taskService = new TaskService();
//        WaitNotifyModel model = new WaitNotifyModel(3, taskService);
        LockConditionModel model = new LockConditionModel(3, taskService);
        new Thread(model.newRunnableProducer()).start();
        new Thread(model.newRunnableConsumer()).start();
        CountDownLatch countDownLatch = new CountDownLatch(1);
        try {
            countDownLatch.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
