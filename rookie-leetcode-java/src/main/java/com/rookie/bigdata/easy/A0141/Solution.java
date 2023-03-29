package com.rookie.bigdata.easy.A0141;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/22 16:42
 * @Version 1.0
 */
public class Solution {


    /**
     * 判断一个单链表是否有环,
     * 可以用 set 存放每一个 节点, 这样每次 访问后把节点丢到这个集合里面.
     * 其实 可以遍历这个单链表, 访问过后,
     * 如果这个节点 不在 set 里面, 把这个节点放入到 set 集合里面.
     * 如果这个节点在 set 里面 , 说明曾经访问过, 所以这个链表有重新 走到了这个节点, 因此一定有环
     * 如果链表都走完了, 把所有的节点都放完了. 还是没有重复的节点, 那说明没有环.
     *
     * @param head
     * @return
     */
    public boolean hasCycle1(ListNode head) {

        Set<ListNode> set = new HashSet<>();
        ListNode node = head;
        while (node != null) {
            //node=node.next;

            if (set.contains(node)) {
                return true;
            } else {
                set.add(node);
                node = node.next;
            }


        }

        return false;


    }

    public boolean hasCycle(ListNode head) {
        Set<ListNode> seen = new HashSet<ListNode>();
        while (head != null) {
            if (!seen.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
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
