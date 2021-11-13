package nowcoder.huawei;

import java.util.Scanner;

public class HJ4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String str = scanner.nextLine();
            int len = str.length();
            int n = (len + 7) / 8;
            int k = 0;
            for (int i = 0; i < n - 1; i++) {
                System.out.println(str.substring(k, k + 8));
                k += 8;
            }
            String last = str.substring(k, len);
            if (last.length() < 8) {
                int diff = 8 - last.length();
                for (int i = 0; i < diff; i++) {
                    last += "0";
                }
            }
            System.out.println(last);
        }
    }
}
