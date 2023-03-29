package com.rookie.bigdata.liuyubobobo.chapter06.ch02;

/**
 * @Classname RookieBST
 * @Description TODO
 * @Author rookie
 * @Date 2021/8/19 10:41
 * @Version 1.0
 */
public class RookieBST<E extends Comparable<E>> {

    private class RookieNode {

        private E e;

        private RookieNode left, right;

        public RookieNode(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }


        private int size;

        private RookieNode root;


        public int size(){
            return size;
        }

        public boolean isEmpty(){
            return size == 0;
        }





    }


//
//    private int size;
//
//    private RookieNode root;
//
//    public RookieBST() {
//        this.root = null;
//        this.size = 0;
//    }
//
//
//    public int getSize() {
//        return this.size;
//    }
//
//
//    public boolean isEmpty() {
//        return size == 0;
//    }
//
//
//    private class RookieNode {
//
//        public E e;
//
//        public RookieNode left, right;
//
//
//        public RookieNode(E e) {
//            this.e = null;
//            this.left = null;
//            this.right = null;
//        }
//
//
//    }


}
