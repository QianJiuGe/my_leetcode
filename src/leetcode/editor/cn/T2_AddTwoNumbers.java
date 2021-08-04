//给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。 
//
// 请你将两个数相加，并以相同形式返回一个表示和的链表。 
//
// 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。 
//
// 
//
// 示例 1： 
//
// 
//输入：l1 = [2,4,3], l2 = [5,6,4]
//输出：[7,0,8]
//解释：342 + 465 = 807.
// 
//
// 示例 2： 
//
// 
//输入：l1 = [0], l2 = [0]
//输出：[0]
// 
//
// 示例 3： 
//
// 
//输入：l1 = [9,9,9,9,9,9,9], l2 = [9,9,9,9]
//输出：[8,9,9,9,0,0,0,1]
// 
//
// 
//
// 提示： 
//
// 
// 每个链表中的节点数在范围 [1, 100] 内 
// 0 <= Node.val <= 9 
// 题目数据保证列表表示的数字不含前导零 
// 
// Related Topics 递归 链表 数学 
// 👍 6263 👎 0


package leetcode.editor.cn;
/**
 * @Description:两数相加
 * @Date:2021-06-01 16:58:38
 * @Author HuangTao
**/


  //Definition for singly-linked list.


public class T2_AddTwoNumbers{
    public static void main(String[] args) {
        Solution solution = new T2_AddTwoNumbers().new Solution();
        // TO TEST
        ListNode l1 = new ListNode(8);
        ListNode l2 = new ListNode(9);
        ListNode l3 =solution.addTwoNumbers(l1, l2);
        System.out.println(l3.val+" " +l3.next.val);
    }

    //leetcode submit region begin(Prohibit modification and deletion)

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 == null && l2 != null) {
            if (l2.val >= 10) {
                l2.val = l2.val % 10;
                if (l2.next == null) {
                    l2.next = new ListNode(1, null);
                } else {
                    l2.next.val++;
                    l2.next = addTwoNumbers(null, l2.next);
                }
            }
            return l2;
        } else if (l1 != null && l2 == null) {
            if (l1.val >= 10) {
                l1.val = l1.val % 10;
                if (l1.next == null) {
                    l1.next = new ListNode(1, null);
                } else {
                    l1.next.val++;
                    l1.next = addTwoNumbers(l1.next,null);
                }
            }
            return l1;
        } else if (l1 != null && l2 != null) {
            ListNode reslink = new ListNode();
            reslink.val = (l1.val + l2.val) % 10;
            if ((l1.val + l2.val) > 9) {
                if (l1.next != null) {
                    l1.next.val++;
                } else if (l2.next != null) {
                    l2.next.val++;
                } else {
                    //创造一个节点
                    l1.next = new ListNode(1, null);
                }
            }
            reslink.next = addTwoNumbers(l1.next, l2.next);
            return reslink;
        }
        return null;
    }
}
//leetcode submit region end(Prohibit modification and deletion)

}
