package nowcoder.tencent;

import gaopin.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 实现二叉树先序，中序和后序遍历
 * https://www.nowcoder.com/practice/a9fec6c46a684ad5a3abd4e365a9d362?tpId=117&&tqId=37819&&companyId=138&rp=1&ru=/company/home/code/138&qru=/ta/job-code-high/question-ranking
 */
public class NC45 {
    public int[][] threeOrders(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        TreeNode preNode = root;
        preOrder(preNode, list);

        int[][] nums = new int[3][list.size()];
        for (int i = 0; i < list.size(); i++) {
            nums[0][i] = list.get(i);
        }
        list.clear();

        TreeNode middleNode = root;
        middleOrder(middleNode, list);
        for (int i = 0; i < list.size(); i++) {
            nums[1][i] = list.get(i);
        }
        list.clear();

        TreeNode afterNode = root;
        afterOrder(afterNode, list);
        for (int i = 0; i < list.size(); i++) {
            nums[2][i] = list.get(i);
        }
        list.clear();

        return nums;
    }

    private void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);
    }

    private void middleOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        middleOrder(root.left, list);
        list.add(root.val);
        middleOrder(root.right, list);
    }

    private void afterOrder(TreeNode root, List<Integer> list) {
        if (root == null) {
            return;
        }
        afterOrder(root.left, list);
        afterOrder(root.right, list);
        list.add(root.val);
    }
}
