package interview;

import org.junit.Test;

public class MainTest {
    @Test
    public void test() {
        Main main = new Main();
        int[] r = main.find("addfffdff", "dff");
        for (int j : r) {
            System.out.println(j);
        }
    }
}
