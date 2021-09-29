package gaopin;

import interview.mayiguoji.MaxProfit;
import org.junit.Test;

import java.util.List;

public class JingDianTest {
    @Test
    public void testMaxSubArray() {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
//        int[] nums = {-1};
        MaxSubArray maxSubArray = new MaxSubArray();
        int r = maxSubArray.maxSubArray(nums);
        System.out.println(r);
    }

    @Test
    public void testMerge() {
        Merge merge = new Merge();
        int[] nums1 = {1, 2, 3, 5, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge.merge(nums1, 4, nums2, 3);
        for (int num : nums1) {
            System.out.println(num);
        }
    }

    @Test
    public void testMaxProfit() {
        int[] prices = {5, 3, 8, 18, 11, 12, 15};
        MaxProfit maxProfit = new MaxProfit();
        int r = maxProfit.maxProfit(prices);
        System.out.println(r);
    }

    @Test
    public void testPalindrome() {
        String s = "A man, a plan, a canal: Panama";
        Palindrome palindrome = new Palindrome();
        boolean r = palindrome.isPalindromeV2(s);
        System.out.println(r);
    }

    @Test
    public void testLevelOrder() {
        TreeNode root = new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7)));
        LevelOrder levelOrder = new LevelOrder();
        List<List<Integer>> r = levelOrder.levelOrder(root);
        for (List<Integer> list : r) {
            for (Integer val : list) {
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void testLRUCache() {
        LRUCache lruCache = new LRUCache(2);
        lruCache.put(1, 1);
        lruCache.put(2, 2);
        System.out.println(lruCache.get(1));
        lruCache.put(3, 3);
        System.out.println(lruCache.get(2));
        lruCache.put(4, 4);
        System.out.println(lruCache.get(1));
        System.out.println(lruCache.get(3));
        System.out.println(lruCache.get(4));
    }

    @Test
    public void testTrap() {
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        Trap trap = new Trap();
        int total = trap.trapV3(height);
        System.out.println(total);
    }
}
