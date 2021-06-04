//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。 
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？ 
//
// 注意：给定 n 是一个正整数。 
//
// 示例 1： 
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶 
//
// 示例 2： 
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
// 
// Related Topics 动态规划 
// 👍 1677 👎 0


package leetcode.editor.cn;
/**
 * @Description:爬楼梯
 * @Date:2021-06-04 14:30:27
 * @Author HuangTao
**/
public class T70_ClimbingStairs{
    public static void main(String[] args) {
        Solution solution = new T70_ClimbingStairs().new Solution();
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int climbStairs(int n) {
        if(n<=2)
            return n;
        int pre1 = 1, pre2 = 2,res = 0 ;
        for(int i = 3;i <= n;i++){
               res = pre1 + pre2;
               pre1 = pre2;
               pre2 = res;
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
