package com.rookie.bigdata.liuyubobobo.chapter05.linked01;
/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

import com.rookie.bigdata.liuyubobobo.chapter05.link02.ListNode;

class Solution2 {

    public ListNode removeElements(ListNode head, int val) {

        while(head != null && head.val == val)
            head = head.next;

        if(head == null)
            return head;

        ListNode prev = head;
        while(prev.next != null){
            if(prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }

        return head;
    }
}