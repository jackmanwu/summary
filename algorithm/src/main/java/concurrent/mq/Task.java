package concurrent.mq;

import java.util.List;

public class Task {
    private List<Integer> list;

    public Task(List<Integer> list) {
        this.list = list;
    }

    public List<Integer> getList() {
        return list;
    }
}
