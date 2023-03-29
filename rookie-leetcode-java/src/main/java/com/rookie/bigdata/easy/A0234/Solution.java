package com.rookie.bigdata.easy.A0234;

import java.util.Stack;

/**
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/23 14:46
 * @Version 1.0
 */
public class Solution {


    public static void main(String[] args) {

    }

    public boolean isPalindrome(ListNode head) {

        ListNode first = head;
        int num = 0;

        Stack<ListNode> stack = new Stack<>();

        //添加到栈中
        while (first != null) {
            stack.push(first);
            first = first.next;
            num++;
        }

        for (int i = 0; i < num; i++) {
            ListNode node = stack.pop();
            if (node.val != head.val) {
                return false;
            }
            head = head.next;

        }

        return true;


    }




    public boolean isPalindrome1(ListNode head) {
        if (head == null) {
            return true;
        }

        // 找到前半部分链表的尾节点并反转后半部分链表
        ListNode firstHalfEnd = endOfFirstHalf(head);
        ListNode secondHalfStart = reverseList(firstHalfEnd.next);

        // 判断是否回文
        ListNode p1 = head;
        ListNode p2 = secondHalfStart;
        boolean result = true;
        while (result && p2 != null) {
            if (p1.val != p2.val) {
                result = false;
            }
            p1 = p1.next;
            p2 = p2.next;
        }

        // 还原链表并返回结果
        firstHalfEnd.next = reverseList(secondHalfStart);
        return result;
    }

    private ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private ListNode endOfFirstHalf(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast.next != null && fast.next.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }
}
