import java.util.*;

/**
 * 华为机试1
 * 解压缩，按照重复数字排序
 */
public class Test1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder score = new StringBuilder();
        StringBuilder value = new StringBuilder();
        List<Pair> list = new ArrayList<>();
        boolean flag = false;
        while (!stack.isEmpty()) {
            Character c = stack.pop();
            if (Character.isDigit(c)) {
                if (!flag) {
                    score.insert(0, c);
                } else {
                    list.add(new Pair(Integer.parseInt(score.toString()), value.toString()));
                    score = new StringBuilder();
                    score.insert(0, c);
                    value = new StringBuilder();
                    flag = false;
                }
            } else {
                flag = true;
                value.insert(0, c);
            }
        }
        if (score.length() > 0 && value.length() > 0) {
            list.add(new Pair(Integer.parseInt(score.toString()), value.toString()));
        }
        list.sort((o1, o2) -> {
            if (o1.score < o2.score) {
                return -1;
            }
            if (o1.score > o2.score) {
                return 1;
            }
            int len1 = o1.value.length();
            int len2 = o2.value.length();
            if (len1 > len2) {
                return 1;
            } else if (len1 < len2) {
                return -1;
            }
            for (int i = 0; i < len1; i++) {
                char c1 = o1.value.charAt(i);
                char c2 = o2.value.charAt(i);
                if (c1 < c2) {
                    return -1;
                } else if (c1 > c2) {
                    return 1;
                }
            }
            return 0;
        });
        StringBuilder result = new StringBuilder();
        for (Pair pair : list) {
            for (int i = 0; i < pair.score; i++) {
                result.append(pair.value);
            }
        }
        System.out.println(result);
    }

    static class Pair {
        int score;
        String value;

        Pair(int score, String value) {
            this.score = score;
            this.value = value;
        }
    }
}
