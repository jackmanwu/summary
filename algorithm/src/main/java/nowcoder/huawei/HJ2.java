package nowcoder.huawei;

import java.util.Scanner;

/**
 * 计算某字母出现次数
 */
public class HJ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String param1 = scanner.nextLine().toLowerCase();
        String param2 = scanner.nextLine().toLowerCase();
        int len = param1.length();
        int total = 0;
        for (int i = 0; i < len; i++) {
            if (param1.charAt(i) == param2.charAt(0)) {
                total++;
            }
        }
        System.out.println(total);
    }
}
