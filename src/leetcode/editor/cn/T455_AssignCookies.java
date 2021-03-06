//假设你是一位很棒的家长，想要给你的孩子们一些小饼干。但是，每个孩子最多只能给一块饼干。 
//
// 对每个孩子 i，都有一个胃口值 g[i]，这是能让孩子们满足胃口的饼干的最小尺寸；并且每块饼干 j，都有一个尺寸 s[j] 。如果 s[j] >= g[i
//]，我们可以将这个饼干 j 分配给孩子 i ，这个孩子会得到满足。你的目标是尽可能满足越多数量的孩子，并输出这个最大数值。 
// 
//
// 示例 1: 
//
// 
//输入: g = [1,2,3], s = [1,1]
//输出: 1
//解释: 
//你有三个孩子和两块小饼干，3个孩子的胃口值分别是：1,2,3。
//虽然你有两块小饼干，由于他们的尺寸都是1，你只能让胃口值是1的孩子满足。
//所以你应该输出1。
// 
//
// 示例 2: 
//
// 
//输入: g = [1,2], s = [1,2,3]
//输出: 2
//解释: 
//你有两个孩子和三块小饼干，2个孩子的胃口值分别是1,2。
//你拥有的饼干数量和尺寸都足以让所有孩子满足。
//所以你应该输出2.
// 
//
// 
//
// 提示： 
//
// 
// 1 <= g.length <= 3 * 104 
// 0 <= s.length <= 3 * 104 
// 1 <= g[i], s[j] <= 231 - 1 
// 
// Related Topics 贪心算法 
// 👍 337 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * @Description:分发饼干
 * @Date:2021-06-02 11:26:17
 * @Author HuangTao
**/
public class T455_AssignCookies{
    public static void main(String[] args) {
        Solution solution = new T455_AssignCookies().new Solution();
        // TO TEST
    }

    /*思路
    *   分别排序  从花费最小的饼干往后排
    * 若能满足人数就加一   指导饼干不能满足或者全部满足  （每个孩子最多只能给一块饼干）
    * */

    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int findContentChildren(int[] g, int[] s) {

        //先对两个数组进行从小到大的排序
        Arrays.sort(g,0,g.length);
        Arrays.sort(s,0,s.length);

        int p =0 , q = 0; //两个工具指针，分别指向g和s数组中的元素
        int res = 0;

        while(p<g.length&&q<s.length){
            //能够被满足
            if(g[p] <= s[q]){
               p++;
               q++;
               res++;
            }
            //不能被满足
            else{
                q++;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
