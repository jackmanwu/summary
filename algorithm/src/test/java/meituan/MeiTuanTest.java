package meituan;

import org.junit.Test;

public class MeiTuanTest {
    @Test
    public void testLongestPalindrome() {
        LongestPalindrome longestPalindrome = new LongestPalindrome();
        String r = longestPalindrome.longestPalindromeV2("babad");
        System.out.println(r);
    }
}
