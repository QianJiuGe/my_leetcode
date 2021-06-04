//给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。 
//
// 
//
// 示例 1: 
//
// 
//输入: s = "abcabcbb"
//输出: 3 
//解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
// 
//
// 示例 2: 
//
// 
//输入: s = "bbbbb"
//输出: 1
//解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
// 
//
// 示例 3: 
//
// 
//输入: s = "pwwkew"
//输出: 3
//解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
//     请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
// 
//
// 示例 4: 
//
// 
//输入: s = ""
//输出: 0
// 
//
// 
//
// 提示： 
//
// 
// 0 <= s.length <= 5 * 104 
// s 由英文字母、数字、符号和空格组成 
// 
// Related Topics 哈希表 双指针 字符串 Sliding Window 
// 👍 5566 👎 0


package leetcode.editor.cn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Description:无重复字符的最长子串
 * @Date:2021-06-04 10:47:46
 * @Author HuangTao
**/
public class T3_LongestSubstringWithoutRepeatingCharacters{
    public static void main(String[] args) {
        Solution solution = new T3_LongestSubstringWithoutRepeatingCharacters().new Solution();
        // TO TEST
        System.out.println(solution.lengthOfLongestSubstring("abcabcbb"));
    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;            //记录最长子串的长度
        HashMap<Character,Integer> map =new HashMap<>();
        int start = 0;   //窗口的左端
        //end相当于窗口的右端
        for(int end = 0; end < s.length() ; end ++){
            //判断窗口中是否有重复元素
            if(map.containsKey(s.charAt(end))){
                start = Math.max(start,map.get(s.charAt(end)) + 1);//在窗口内部的才能使左端右移
            }
            map.put(s.charAt(end),end);         //不存在会添加  存在会覆盖
            res = Math.max(res,(end - start + 1));
        }
        return res;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
