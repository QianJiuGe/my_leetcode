//给你一个字符串 s，找到 s 中最长的回文子串。 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "babad"
//输出："bab"
//解释："aba" 同样是符合题意的答案。
// 
//
// 示例 2： 
//
// 
//输入：s = "cbbd"
//输出："bb"
// 
//
// 示例 3： 
//
// 
//输入：s = "a"
//输出："a"
// 
//
// 示例 4： 
//
// 
//输入：s = "ac"
//输出："a"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 仅由数字和英文字母（大写和/或小写）组成 
// 
// Related Topics 字符串 动态规划 
// 👍 3883 👎 0


package leetcode.editor.cn;
/**
 * @Description:最长回文子串
 * @Date:2021-07-30 11:09:23
 * @Author HuangTao
**/
public class T5_LongestPalindromicSubstring{
    public static void main(String[] args) {
        Solution solution = new T5_LongestPalindromicSubstring().new Solution();
        // TO TEST
        String s = solution.longestPalindrome("jjbbbbbbbbbjjk");
        System.out.println(s);
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String longestPalindrome(String s) {

        int len = 0;            //记录子串的长度
        int start,end;      //记录子串的开始和结束的位置
        String res = s.substring(0,0);         //记录子串的内容  即最终结果
        for(int pos = 0 ;pos<s.length();pos++ ){
            //一个字符作为中心扩展
            int len1 = caculateLen(s,pos-1,pos+1);
            //两个字符作为中心扩展
            int len2 = 0;
            if(pos+1<s.length()&&s.charAt(pos) == s.charAt(pos+1)) {
                len2 = caculateLen(s,pos-1, pos+2);
            }
            if(len1>len2 && len1>len){
                len = len1;
                res = s.substring(pos-(len/2),pos+(len/2)+1);
            }else if(len2>len1 && len2>len){
                len = len2;
                res = s.substring(pos+1-(len/2),pos+(len/2)+1);
            }
        }
        return res;
    }

    private int caculateLen(String s, int start, int end) {
        int res = end - start - 1;  //初始长度
        while(start>-1&&end<s.length()){
            if(s.charAt(start) == s.charAt(end)){
                start--;
                end++;
                res += 2;
            }else{
                break;
            }
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
