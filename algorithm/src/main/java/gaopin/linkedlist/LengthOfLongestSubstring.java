package gaopin.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * 无重复字符的最长子串
 */
public class LengthOfLongestSubstring {
    /**
     * 滑动窗口
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        Set<Character> cache = new HashSet<>();
        int len = s.length();
        int rk = -1;
        int max = 0;
        for (int i = 0; i < len; ++i) {
            if (i > 0) {
                cache.remove(s.charAt(i - 1));
            }
            while (rk + 1 < len && !cache.contains(s.charAt(rk + 1))) {
                cache.add(s.charAt(rk + 1));
                rk++;
            }
            max = Math.max(max, rk - i + 1);
        }
        return max;
    }
}
