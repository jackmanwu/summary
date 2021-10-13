package gaopin;

import gaopin.string.ValidPalindrome;
import org.junit.Test;

public class StringTest {
    @Test
    public void testValidPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        boolean r = validPalindrome.validPalindrome("abc");
        System.out.println(r);
    }
}
