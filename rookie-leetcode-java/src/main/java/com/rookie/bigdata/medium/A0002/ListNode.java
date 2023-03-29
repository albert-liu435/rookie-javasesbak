package com.rookie.bigdata.medium.A0002;

/**
 * @ClassName ListNode
 * @Description ListNode
 * @Author liuxili
 * @Date 2020/10/16 15:07
 * @Version 1.0
 */
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
