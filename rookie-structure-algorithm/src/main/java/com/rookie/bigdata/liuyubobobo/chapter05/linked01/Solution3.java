package com.rookie.bigdata.liuyubobobo.chapter05.linked01;
/// Leetcode 203. Remove Linked List Elements
/// https://leetcode.com/problems/remove-linked-list-elements/description/

import com.rookie.bigdata.liuyubobobo.chapter05.link02.ListNode;

class Solution3 {

    public ListNode removeElements(ListNode head, int val) {

        ListNode dummyHead = new ListNode(-1);
        dummyHead.next = head;

        ListNode prev = dummyHead;
        while(prev.next != null){
            if(prev.next.val == val)
                prev.next = prev.next.next;
            else
                prev = prev.next;
        }

        return dummyHead.next;
    }
}