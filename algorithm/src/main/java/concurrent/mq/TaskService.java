package concurrent.mq;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class TaskService {
    public Task mockGetFromDB() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 11; i++) {
            list.add(ThreadLocalRandom.current().nextInt(1000));
        }
        return new Task(list);
    }
}
