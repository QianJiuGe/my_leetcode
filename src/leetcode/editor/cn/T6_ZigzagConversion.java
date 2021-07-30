//将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。 
//
// 比如输入字符串为 "PAYPALISHIRING" 行数为 3 时，排列如下： 
//
// 
//P   A   H   N
//A P L S I I G
//Y   I   R 
//
// 之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如："PAHNAPLSIIGYIR"。 
//
// 请你实现这个将字符串进行指定行数变换的函数： 
//
// 
//string convert(string s, int numRows); 
//
// 
//
// 示例 1： 
//
// 
//输入：s = "PAYPALISHIRING", numRows = 3
//输出："PAHNAPLSIIGYIR"
// 
//示例 2：
//
// 
//输入：s = "PAYPALISHIRING", numRows = 4
//输出："PINALSIGYAHRPI"
//解释：
//P     I    N
//A   L S  I G
//Y A   H R
//P     I
// 
//
// 示例 3： 
//
// 
//输入：s = "A", numRows = 1
//输出："A"
// 
//
// 
//
// 提示： 
//
// 
// 1 <= s.length <= 1000 
// s 由英文字母（小写和大写）、',' 和 '.' 组成 
// 1 <= numRows <= 1000 
// 
// Related Topics 字符串 
// 👍 1221 👎 0


package leetcode.editor.cn;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:Z 字形变换
 * @Date:2021-07-30 15:00:37
 * @Author HuangTao
**/
public class T6_ZigzagConversion{
    public static void main(String[] args) {
        Solution solution = new T6_ZigzagConversion().new Solution();
        // TO TEST
        String s = solution.convert("PAYPALISHIRING", 3);
        System.out.println(s);
    }


    /**
     * 此解法关键在于：将第一行的下标  除第一个外都重复记录后  后面的行（除最后一行）都可以由上一行加一或者减去一得到
     * 1 5 5 9 9
     * 2 4 6 8 10
     * 3   7
     */
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
            return s;
        StringBuilder res = new StringBuilder();
        int len = s.length();
        //需要开的数组长度
        int numLens = (len/(2*numRows-2)+1)*2;
        int []arr = new int[numLens];
        //一行一行的遍历  储存上一行的内容  并且拼接到结果字符串中
        int pos = 0;
        //先存第一行  除了第一个元素外  其他的都重复存
        for(int i = 0;i<numLens;i++){
            if(i==0){
                arr[i] = pos;
                if(pos<len){
                    res.append(s.charAt(pos));
                }
                pos=pos + 2*numRows-2;
            }else{
                arr[i] = pos;
                if(i+1<numLens){
                    arr[++i] = pos;
                }
                if(pos<len){
                    res.append(s.charAt(pos));
                }
                pos=pos + 2*numRows-2;
            }
        }
        //取中间行 不包含第一行和最后一行
        //在上一行的基础上  单数列+1 偶数列-1
        for(int j = 1;j<numRows-1;j++){
            pos = arr[0];
            for(int i = 0;i<numLens;i++){
                if(i%2==0){
                    //单数列
                    pos = arr[i]+1;
                }else{
                    pos = arr[i]-1;
                }
                arr[i] = pos;
                if(pos<len&&pos>=0){
                    res.append(s.charAt(pos));
                }
            }
        }
        //最后一行
        pos = arr[0]+1;
        while(pos<len){
            res.append(s.charAt(pos));
            pos=pos + 2*numRows-2;
        }
        return res.toString();
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
