package com.rookie.bigdata.medium.A0019;

/**
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/23 11:42
 * @Version 1.0
 */
public class Solution {

    public static void main(String[] args) {
        ListNode head = new ListNode(1, null);
//        head.next=new ListNode(2,null);
//        head.next.next=new ListNode(3,null);
//        head.next.next.next=new ListNode(4,null);
//        head.next.next.next.next=new ListNode(5,null);

        removeNthFromEnd(head, 1);
    }


    /**
     * 需要考虑边界问题
     *
     * @param head
     * @param n
     * @return
     */
    public static ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode dummy = new ListNode(0, head);

        ListNode first = head;
        ListNode second = dummy;
        int firstNum = 0, secondNum = 0;
        while (first != null) {

            if (firstNum - secondNum >= n) {
                secondNum++;
                second = second.next;
            }
            firstNum++;
            first = first.next;

        }

        second.next = second.next.next;
        ListNode ans = dummy.next;

        return ans;


    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode first = head;
        ListNode second = dummy;
        for (int i = 0; i < n; ++i) {
            first = first.next;
        }
        while (first != null) {
            first = first.next;
            second = second.next;
        }
        second.next = second.next.next;
        ListNode ans = dummy.next;
        return ans;
    }

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

}
