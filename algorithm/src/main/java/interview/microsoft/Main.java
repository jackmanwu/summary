package interview.microsoft;

import java.util.*;

public class Main {
    public int[] find(int[] arr, int target) {
        int len = arr.length;
//        Arrays.sort(arr);
        Map<Integer, List<Integer>> cache = new HashMap<>();
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                int sum = arr[i] + arr[j];
                List<Integer> indexes = new ArrayList<>();
                indexes.add(i);
                indexes.add(j);
                if (sum < target) {
                    cache.put(target - sum, indexes);
                } else if (sum == target) {
                    cache.put(0, indexes);
                    break;
                } else {
                    cache.put(sum - target, indexes);
                }
            }
        }
        if (cache.containsKey(0)) {
            return convert(cache.get(0));
        }
        int min = Integer.MAX_VALUE;
        List<Integer> list = null;
        for (Integer key : cache.keySet()) {
            if (key < min) {
                min = key;
                list = cache.get(key);
            }
        }
        if (list != null) {
            return convert(list);
        }
        return new int[0];
    }

    private int[] convert(List<Integer> list) {
        int size = list.size();
        int[] nums = new int[size];
        for (int i = 0; i < size; i++) {
            nums[i] = list.get(i);
        }
        return nums;
    }
}
