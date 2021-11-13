package nowcoder.huawei;

import java.util.*;

/**
 * 明明的随机数
 * https://www.nowcoder.com/practice/3245215fffb84b7b81285493eae92ff0?tpId=37&&tqId=21226&rp=1&ru=/ta/huawei&qru=/ta/huawei/question-ranking
 */
public class HJ3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNext()) {
            list.add(scanner.nextInt());
        }
        int len = list.size();
        int[] nums = new int[len];
        int i = 0;
        int k = 0;
        while (i < len) {
            int total = list.get(i);
            int[] subs = new int[total];
            for (int j = 0; j < total; j++) {
                subs[j] = list.get(++i);
            }
            i++;
            Arrays.sort(subs);
            nums[k++] = subs[0];
            for (int j = 1; j < subs.length; j++) {
                if (subs[j - 1] != subs[j]) {
                    nums[k++] = subs[j];
                }
            }
        }

        for (int num : nums) {
            if (num > 0) {
                System.out.println(num);
            }
        }
    }
}
