package nowcoder.microsoft;

/**
 * 连续子数组的最大和
 * https://www.nowcoder.com/practice/459bd355da1549fa8a49e350bf3df484?tpId=117&&tqId=37797&&companyId=146&rp=1&ru=/company/home/code/146&qru=/ta/job-code-high/question-ranking
 */
public class NC19 {
    public int findGreatestSumOfSubArray(int[] array) {
        int maxSum = array[0];
        int prev = 0;
        for (int num : array) {
            prev = Math.max(prev + num, num);
            maxSum = Math.max(maxSum, prev);
        }
        return maxSum;
    }
}
