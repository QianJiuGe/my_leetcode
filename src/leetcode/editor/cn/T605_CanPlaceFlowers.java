//假设有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花不能种植在相邻的地块上，它们会争夺水源，两者都会死去。 
//
// 给你一个整数数组 flowerbed 表示花坛，由若干 0 和 1 组成，其中 0 表示没种植花，1 表示种植了花。另有一个数 n ，能否在不打破种植规则
//的情况下种入 n 朵花？能则返回 true ，不能则返回 false。 
//
// 
//
// 示例 1： 
//
// 
//输入：flowerbed = [1,0,0,0,1], n = 1
//输出：true
// 
//
// 示例 2： 
//
// 
//输入：flowerbed = [1,0,0,0,1], n = 2
//输出：false
// 
//
// 
//
// 提示： 
//
// 
// 1 <= flowerbed.length <= 2 * 104 
// flowerbed[i] 为 0 或 1 
// flowerbed 中不存在相邻的两朵花 
// 0 <= n <= flowerbed.length 
// 
// Related Topics 贪心算法 数组 
// 👍 356 👎 0


package leetcode.editor.cn;

/**
 * @Description:种花问题
 * @Date:2021-06-03 09:38:59
 * @Author HuangTao
 **/
public class T605_CanPlaceFlowers {
    public static void main(String[] args) {
        Solution solution = new T605_CanPlaceFlowers().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public boolean canPlaceFlowers(int[] flowerbed, int n) {

            int p = 0;  //遍历数组用的工具指针
            int sum = 0; //可以种植的花

            while (p < flowerbed.length) {
                //如果当前节点为0
                if (flowerbed[p] == 0) {
                    //如果右边没有节点
                    if ((p + 1) == flowerbed.length) {
                        sum++;
                        p++;
                    }
                    //如果右边节点为0
                    else if (flowerbed[p + 1] == 0) {
                        sum++;
                        p = p + 2;
                    }
                    //如果右边节点为1
                    else if (flowerbed[p + 1] == 1) {
                        p = p + 3;
                    }
                }
                //如果当前节点为1
                else {
                    p = p + 2;
                }
                //判断是否达到题目要求
                if (n <= sum) {
                    return true;
                }
            }
            return false;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
