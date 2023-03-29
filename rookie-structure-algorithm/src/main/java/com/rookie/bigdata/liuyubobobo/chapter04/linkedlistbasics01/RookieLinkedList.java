package com.rookie.bigdata.liuyubobobo.chapter04.linkedlistbasics01;

/**
 * @Classname RookieLinkedList
 * @Description TODO
 * @Author rookie
 * @Date 2021/8/17 10:49
 * @Version 1.0
 */
public class RookieLinkedList<E> {


    private class Node {
        public E e;
        public Node next;

        public Node(E e, Node next) {
            this.e = e;
            this.next = next;
        }

        public Node(E e) {
            this(e, null);
        }

        public Node() {
            this(null, null);
        }

        @Override
        public String toString() {
            return e.toString();
        }
    }
}
