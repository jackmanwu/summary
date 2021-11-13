package nowcoder.huawei;

import java.util.Scanner;

public class HJ1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        int len = line.length();
        int lastLen = 0;
        for (int i = len - 1; i >= 0; i--) {
            if (line.charAt(i) == ' ') {
                break;
            }
            lastLen++;
        }
        System.out.println(lastLen);
    }
}
