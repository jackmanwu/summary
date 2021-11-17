import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * 华为机试2
 * 最长数字串
 *
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine().trim();
        if (str.length() == 0) {
            System.out.println(" ");
        }
        Deque<Character> stack = new LinkedList<>();
        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        StringBuilder builder = new StringBuilder();
        int maxLen = 0;
        String result = "";
        while (!stack.isEmpty()) {
            Character c = stack.pop();
            if (c == '.') {
                if (builder.toString().contains(".")) {
                    int size = builder.toString().length();
                    if (builder.toString().charAt(0) == '.') {
                        size = size - 1;
                    }
                    if (size > maxLen) {
                        maxLen = size;
                        result = builder.toString();
                    }
                    builder = new StringBuilder(builder.substring(0, builder.toString().indexOf(".")));
                }
                builder.insert(0, c);
            }
            if (Character.isDigit(c)) {
                builder.insert(0, c);
            }
            if (Character.isLetter(c)) {
                int size = builder.toString().length();
                if (builder.toString().charAt(0) == '.') {
                    size = size - 1;
                }
                if (size > maxLen) {
                    maxLen = size;
                    result = builder.toString();
                }
            }
        }
        System.out.println(result);
    }
}
