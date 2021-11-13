package nowcoder.microsoft;

/**
 * 跳台阶
 * https://www.nowcoder.com/practice/8c82a5b80378478f9484d87d1c5f12a4?tpId=117&&tqId=37764&&companyId=146&rp=1&ru=/company/home/code/146&qru=/ta/job-code-high/question-ranking
 */
public class NC68 {
    public int jumpFloor(int target) {
        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 0; i < target; i++) {
            p = q;
            q = r;
            r = p + q;
        }
        return r;
    }
}
