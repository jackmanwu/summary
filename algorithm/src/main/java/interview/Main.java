package interview;

/**
 * 滴滴
 *
 */
public class Main {
    public int[] find(String a, String b) {
        int len = a.length();
        int total = 0;
        int firstIndex = -1;
        int lastIndex = -1;
        for (int i = 0; i < len; i++) {
            int j = i+1;
            while (j < len) {
                if (b.equals(a.substring(i, j-1))) {
                    System.out.println(i+","+j+","+a.substring(i,j-1));
                    total++;
                    if (firstIndex == -1) {
                        firstIndex = i;
                    }
                    lastIndex = i;
                }
                j++;
            }
        }
        return new int[]{total, firstIndex, lastIndex};
    }
}
