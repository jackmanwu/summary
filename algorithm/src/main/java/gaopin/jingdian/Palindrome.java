package gaopin.jingdian;

/**
 * 验证回文串
 */
public class Palindrome {
    /**
     * 反转字符串
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        StringBuilder builder = new StringBuilder();
        int len = s.length();
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) {
                builder.append(Character.toLowerCase(c));
            }
        }
        StringBuilder builderRev = new StringBuilder(builder).reverse();
        return builderRev.toString().equals(builder.toString());
    }

    /**
     * 双指针
     *
     * @param s
     * @return
     */
    public boolean isPalindromeV2(String s) {
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                ++left;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                --right;
            }
            if (left < right) {
                if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                    return false;
                }
                ++left;
                --right;
            }
        }
        return true;
    }
}
