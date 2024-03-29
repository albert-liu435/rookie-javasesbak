package com.rookie.bigdata.easy.A0021;

/**
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。 
 * <p>
 *  
 * <p>
 * 示例：
 * <p>
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/merge-two-sorted-lists
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @author rookie
 * @version 1.0
 * @date 2020/6/28 0:21
 */
public class Solution {
    public static void main(String[] args) {

    }


    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {


        ListNode prehead=new ListNode(0);
        ListNode prev=prehead;

//        ListNode la=l1;
//        ListNode lb=l2;

        while(l1 !=null && l2 !=null){
            if(l1.val<=l2.val){
                prev.next=l1;
                l1=l1.next;

                //newListNode=newListNode.next;
            }else {
                prev.next=l2;
                l2=l2.next;

                //newListNode=newListNode.next;
            }
            prev=prev.next;
        }

        prev.next= l1 ==null? l2:l1;

        return  prehead.next;

    }


    public ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode prehead = new ListNode(-1);

        ListNode prev = prehead;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            } else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }

        // 合并后 l1 和 l2 最多只有一个还未被合并完，我们直接将链表末尾指向未合并完的链表即可
        prev.next = l1 == null ? l2 : l1;

        return prehead.next;
    }




    public class ListNode {
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


}
