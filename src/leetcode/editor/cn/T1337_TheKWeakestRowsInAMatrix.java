//给你一个大小为 m * n 的矩阵 mat，矩阵由若干军人和平民组成，分别用 1 和 0 表示。 
//
// 请你返回矩阵中战斗力最弱的 k 行的索引，按从最弱到最强排序。 
//
// 如果第 i 行的军人数量少于第 j 行，或者两行军人数量相同但 i 小于 j，那么我们认为第 i 行的战斗力比第 j 行弱。 
//
// 军人 总是 排在一行中的靠前位置，也就是说 1 总是出现在 0 之前。 
//
// 
//
// 示例 1： 
//
// 
//输入：mat = 
//[[1,1,0,0,0],
// [1,1,1,1,0],
// [1,0,0,0,0],
// [1,1,0,0,0],
// [1,1,1,1,1]], 
//k = 3
//输出：[2,0,3]
//解释：
//每行中的军人数目：
//行 0 -> 2 
//行 1 -> 4 
//行 2 -> 1 
//行 3 -> 2 
//行 4 -> 5 
//从最弱到最强对这些行排序后得到 [2,0,3,1,4]
// 
//
// 示例 2： 
//
// 
//输入：mat = 
//[[1,0,0,0],
// [1,1,1,1],
// [1,0,0,0],
// [1,0,0,0]], 
//k = 2
//输出：[0,2]
//解释： 
//每行中的军人数目：
//行 0 -> 1 
//行 1 -> 4 
//行 2 -> 1 
//行 3 -> 1 
//从最弱到最强对这些行排序后得到 [0,2,3,1]
// 
//
// 
//
// 提示： 
//
// 
// m == mat.length 
// n == mat[i].length 
// 2 <= n, m <= 100 
// 1 <= k <= m 
// matrix[i][j] 不是 0 就是 1 
// 
// Related Topics 数组 二分查找 
// 👍 49 👎 0


package leetcode.editor.cn;

import javax.swing.*;
import java.util.*;

/**
 * @Description:矩阵中战斗力最弱的 K 行
 * @Date:2021-06-04 17:10:11
 * @Author HuangTao
**/
public class T1337_TheKWeakestRowsInAMatrix{
    public static void main(String[] args) {
        Solution solution = new T1337_TheKWeakestRowsInAMatrix().new Solution();
        // TO TEST

        int[][] mat = new int[][]{{1,1,0,0,0},{1,1,1,1,0},{1,0,0,0,0},{1,1,0,0,0},{1,1,1,1,1}};
        int k = 3;

        System.out.println(solution.kWeakestRows(mat, k));

    }
    
    //leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {

        int len1 = mat.length;
        int len2 = mat[0].length;
        HashMap<Integer,Integer> map = new HashMap<>();

        int j,sum;
        for(int i = 0;i < len1;i++) {
            j = 0;
            sum = 0;
            while(j<len2 && mat[i][j]!=0){
                sum++;
                j++;
            }
            map.put(i, sum);
        }

        List<Map.Entry<Integer, Integer>> entryList
                = new ArrayList<Map.Entry<Integer, Integer>>(map.entrySet());

        Collections.sort(entryList,
                new Comparator<Map.Entry<Integer, Integer>>() {
                    @Override
                    public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                        if (o1.getValue() > o2.getValue())
                            return 1;
                        else if (o1.getValue() == o2.getValue() && o1.getKey() > o2.getKey())
                            return 1;
                        return -1;
                    }
                });

        int[] res = new int[k];
        for(int i =0 ;i<k;i++){
            res[i] = entryList.get(i).getKey();
        }
        return res;
    }
}

//leetcode submit region end(Prohibit modification and deletion)

}
