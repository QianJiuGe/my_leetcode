//给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。 
//
// 
// 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-4,-1,0,3,10]
//输出：[0,1,9,16,100]
//解释：平方后，数组变为 [16,1,0,9,100]
//排序后，数组变为 [0,1,9,16,100] 
//
// 示例 2： 
//
// 
//输入：nums = [-7,-3,2,3,11]
//输出：[4,9,9,49,121]
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 104 
// -104 <= nums[i] <= 104 
// nums 已按 非递减顺序 排序 
// 
//
// 
//
// 进阶： 
//
// 
// 请你设计时间复杂度为 O(n) 的算法解决本问题 
// 
// Related Topics 数组 双指针 排序 
// 👍 259 👎 0


package leetcode.editor.cn;

import java.util.Arrays;

/**
 * @Description:有序数组的平方
 * @Date:2021-07-31 10:47:06
 * @Author HuangTao
**/
public class T977_SquaresOfASortedArray{
    public static void main(String[] args) {
        Solution solution = new T977_SquaresOfASortedArray().new Solution();
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] sortedSquares(int[] nums) {
        int end = nums.length -1 ;
        int start = 0;
        int []res = new int[nums.length];
        int pos = end;
        while(end>=start){
            if(nums[end]*nums[end] > nums[start]*nums[start]){
                res[pos--] = nums[end]*nums[end];
                end--;
            }else{
                res[pos--] = nums[start]*nums[start];
                start++;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
