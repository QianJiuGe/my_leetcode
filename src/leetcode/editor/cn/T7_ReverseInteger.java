//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−231, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -231 <= x <= 231 - 1 
// 
// Related Topics 数学 
// 👍 2966 👎 0


package leetcode.editor.cn;
/**
 * @Description:整数反转
 * @Date:2021-08-01 19:51:08
 * @Author HuangTao
**/
public class T7_ReverseInteger{
    public static void main(String[] args) {
        Solution solution = new T7_ReverseInteger().new Solution();
        // TO TEST
        int i = solution.reverse(-125 );
        System.out.println(i);
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int reverse(int x) {
            long res = 0;
            while(x!=0){
                res =res*10 + x%10;
                x= x/10;
            }
            return (int)res==res?(int)res:0;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
