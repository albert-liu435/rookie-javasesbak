package com.rookie.bigdata.medium.A0142;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/22 16:58
 * @Version 1.0
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        //ListNode prev = head;
        while (node != null) {
            //node=node.next;

            if (set.contains(node)) {
                return node;
                //return true;
            } else {
                set.add(node);
                node = node.next;
            }


        }

        return null;
    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
