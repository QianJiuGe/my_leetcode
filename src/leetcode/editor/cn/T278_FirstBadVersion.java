//你是产品经理，目前正在带领一个团队开发新的产品。不幸的是，你的产品的最新版本没有通过质量检测。由于每个版本都是基于之前的版本开发的，所以错误的版本之后的所有
//版本都是错的。 
//
// 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。 
//
// 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。实现一个函数来查找第一个错误
//的版本。你应该尽量减少对调用 API 的次数。 
// 
//
// 示例 1： 
//
// 
//输入：n = 5, bad = 4
//输出：4
//解释：
//调用 isBadVersion(3) -> false 
//调用 isBadVersion(5) -> true 
//调用 isBadVersion(4) -> true
//所以，4 是第一个错误的版本。
// 
//
// 示例 2： 
//
// 
//输入：n = 1, bad = 1
//输出：1
// 
//
// 
//
// 提示： 
//
// 
// 1 <= bad <= n <= 231 - 1 
// 
// Related Topics 二分查找 交互 
// 👍 364 👎 0


package leetcode.editor.cn;
/**
 * @Description:第一个错误的版本
 * @Date:2021-07-31 10:11:29
 * @Author HuangTao
**/
public class T278_FirstBadVersion{
    public static void main(String[] args) {
        Solution solution = new T278_FirstBadVersion().new Solution();
        // TO TEST
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */
    public class Solution /*extends VersionControl*/ {
        public int firstBadVersion(int n) {
            int start = 1;
            while(start<=n){
                int pos = start + (n-start)/2;
                if( 0==0/*!isBadVersion(pos)*/){
                    start = pos +1;
                }else{
                    n = pos -1;
                }
            }
            return start;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

}
