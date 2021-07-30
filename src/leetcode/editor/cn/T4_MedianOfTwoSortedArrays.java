//给定两个大小分别为 m 和 n 的正序（从小到大）数组 nums1 和 nums2。请你找出并返回这两个正序数组的 中位数 。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums1 = [1,3], nums2 = [2]
//输出：2.00000
//解释：合并数组 = [1,2,3] ，中位数 2
// 
//
// 示例 2： 
//
// 
//输入：nums1 = [1,2], nums2 = [3,4]
//输出：2.50000
//解释：合并数组 = [1,2,3,4] ，中位数 (2 + 3) / 2 = 2.5
// 
//
// 示例 3： 
//
// 
//输入：nums1 = [0,0], nums2 = [0,0]
//输出：0.00000
// 
//
// 示例 4： 
//
// 
//输入：nums1 = [], nums2 = [1]
//输出：1.00000
// 
//
// 示例 5： 
//
// 
//输入：nums1 = [2], nums2 = []
//输出：2.00000
// 
//
// 
//
// 提示： 
//
// 
// nums1.length == m 
// nums2.length == n 
// 0 <= m <= 1000 
// 0 <= n <= 1000 
// 1 <= m + n <= 2000 
// -106 <= nums1[i], nums2[i] <= 106 
// 
//
// 
//
// 进阶：你能设计一个时间复杂度为 O(log (m+n)) 的算法解决此问题吗？ 
// Related Topics 数组 二分查找 分治 
// 👍 4291 👎 0


package leetcode.editor.cn;
/**
 * @Description:寻找两个正序数组的中位数
 * @Date:2021-07-27 13:43:48
 * @Author HuangTao
**/
public class T4_MedianOfTwoSortedArrays{
    public static void main(String[] args) {
        Solution solution = new T4_MedianOfTwoSortedArrays().new Solution();
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public double findMedianSortedArrays(int[] nums1, int[] nums2) {
            int len = nums1.length + nums2.length;
            int m = nums1.length;
            int n = nums2.length;
            int pos = (m+n)/2;

            int i =0,j=0;
            double res =0;   //记录中位数的值

            if(len%2==0){

                while((i+j)!=pos && i<m &&j<n){
                    if(nums1[i]<nums2[j]){
                        res = nums1[i];
                        i++;
                    }else{
                        res = nums2[j];
                        j++;
                    }
                }
                if(i==m){
                    while(j<pos-m){
                        res =nums2[j]; j++;
                    }
                    return (res+nums2[j]) /2;
                }
                else if(j==n){
                    while(i<pos-n){
                        res =nums1[i]; i++;
                    }
                    return (res+nums1[i]) /2;
                }else{
                    if(nums1[i]<nums2[j]){
                        return (res + nums1[i])/2;
                    }else{
                        return (res + nums2[j])/2;
                    }
                }

            }else{
                while((i+j)!=pos && i<m &&j<n){
                    if(nums1[i]<nums2[j]){
                        res = nums1[i];
                        i++;
                    }else{
                        res = nums2[j];
                        j++;
                    }
                }
                if(i==m){
                    while(j<=pos-m){
                        res =nums2[j]; j++;
                    }
                }
                else if(j==n){
                    while(i<=pos-n){
                        res =nums1[i]; i++;
                    }
                }else{
                    if(nums1[i]<nums2[j]){
                        res = nums1[i];
                    }else{
                        res = nums2[j];
                    }
                }
                return res;
            }
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
