package interview;

import interview.microsoft.Main;
import org.junit.Test;

public class MicroSoftTest {
    @Test
    public void testFind() {
        Main main = new Main();
        int[] params = new int[]{-1, 2, 4, 5};
        int target = 4;
        int[] result = main.find(params, target);
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
