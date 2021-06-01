//给你两个有序整数数组 nums1 和 nums2，请你将 nums2 合并到 nums1 中，使 nums1 成为一个有序数组。 
//
// 初始化 nums1 和 nums2 的元素数量分别为 m 和 n 。你可以假设 nums1 的空间大小等于 m + n，这样它就有足够的空间保存来自 nums2 的元素。
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,2,3,0,0,0], m = 3, nums2 = [2,5,6], n = 3
//输出：[1,2,2,3,5,6]
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1], m = 1, nums2 = [], n = 0
//输出：[1]
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m + n 
// nums2.length == n 
// 0 <= m, n <= 200 
// 1 <= m + n <= 200 
// -109 <= nums1[i], nums2[i] <= 109 
// 
// Related Topics 数组 双指针 
// 👍 963 👎 0


package leetcode.editor.cn;
/**
 * @Description:合并两个有序数组
 * @Date:2021-06-01 14:38:31
 * @Author HuangTao
**/
public class T88_MergeSortedArray{
    public static void main(String[] args) {
        Solution solution = new T88_MergeSortedArray().new Solution();
        // TO TEST
    }

    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int tail = m+n-1;  //尾巴
        int p1 = m -1, p2 = n-1;     //用来标记数组当前的位置

        //从后往前合并，这样可以省去空间存放被抵消的数字
        while(tail >= 0){
            //先判断nums1和nums2是否已经空了
            if(p1 >= 0&&p2>= 0) //都不空
            {
                //谁大谁存在tail上
                if(nums1[p1] < nums2[p2]){
                    nums1[tail] = nums2[p2];
                    p2--;
                }else{
                    nums1[tail] = nums1[p1];
                    p1--;
                }
            }
            else if(p1 <0 && p2 >= 0)
            {
                //num1空了  合并剩下的nums2到nums1
                nums1[tail] = nums2[p2];
                p2--;
            }
            else if(p2 < 0)
            {
                //num2空了 不需要操作直接跳出循环
                break;
            }
            tail --;
        }
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
