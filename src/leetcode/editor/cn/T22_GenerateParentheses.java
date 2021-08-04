//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例 1： 
//
// 
//输入：n = 3
//输出：["((()))","(()())","(())()","()(())","()()()"]
// 
//
// 示例 2： 
//
// 
//输入：n = 1
//输出：["()"]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= n <= 8 
// 
// Related Topics 字符串 动态规划 回溯 
// 👍 1940 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:括号生成
 * @Date:2021-08-03 19:31:48
 * @Author HuangTao
**/
public class T22_GenerateParentheses{
    public static void main(String[] args) {
        Solution solution = new T22_GenerateParentheses().new Solution();
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        List<List<String>> dpList = new ArrayList<>();
        List<String> list1 = new ArrayList<>();
        list1.add("()");
        for(int i = 1;i<n;i++){
            List<String> temp = new ArrayList<>();
            for(int j = 0;j<i;j++){
                //循环传入p和q  确保p+q =  i-1
                //传入p和q之后  到对应的数组里拿取相应的结果  并拼接后存入到新的数组中
                //要注意是从0开始的

            }
        }

        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
