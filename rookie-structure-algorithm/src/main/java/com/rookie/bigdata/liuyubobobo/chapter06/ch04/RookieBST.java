package com.rookie.bigdata.liuyubobobo.chapter06.ch04;

/**
 * @Classname RookieBST
 * @Description TODO
 * @Author rookie
 * @Date 2021/8/19 10:41
 * @Version 1.0
 */
public class RookieBST<E extends Comparable<E>> {


    private int size;

    private RookieNode root;

    public RookieBST() {
        this.root = null;
        this.size = 0;
    }


    public int getSize() {
        return this.size;
    }


    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * 向二分搜索树中添加元素
     *
     * @param e
     */
    public void add(E e) {
        root=add(root, e);
    }

    /**
     * 递归添加节点
     *
     * @param node
     * @param e
     */
    private RookieNode add(RookieNode node, E e) {

        if (node == null){
            size++;
            return new RookieNode(e);
        }


        if (e.compareTo(node.e) < 0)
            node.left = add(node.left, e);
        else if (e.compareTo(node.e) > 0)
            node.right = add(node.right, e);

        return node;

    }



//    /**
//     * 向二分搜索树中添加元素
//     *
//     * @param e
//     */
//    public void add(E e) {
//        if (root == null) {
//            root = new RookieNode(e);
//            size++;
//        } else {
//
//            add(root, e);
//        }
//    }
//
//    /**
//     * 递归添加节点
//     *
//     * @param node
//     * @param e
//     */
//    private void add(RookieNode node, E e) {
//
//        if(e.equals(node.e))
//            return;
//        else if(e.compareTo(node.e) < 0 && node.left == null){
//            node.left = new RookieNode(e);
//            size ++;
//            return;
//        }
//        else if(e.compareTo(node.e) > 0 && node.right == null){
//            node.right = new RookieNode(e);
//            size ++;
//            return;
//        }
//
//        if(e.compareTo(node.e) < 0)
//            add(node.left, e);
//        else //e.compareTo(node.e) > 0
//            add(node.right, e);
//
//    }

    /**
     * 非递归添加节点
     *
     * @param root
     * @param e
     */
    private void add2(RookieNode root, E e) {
        //对node判断

        RookieNode tmp = root;
        RookieNode prev = root;

        while (tmp != null) {

            if (e.compareTo(tmp.e) > 0) {
                if (tmp.right == null) {
                    RookieNode node = new RookieNode(e);
                    tmp.right = node;
                    return;
                } else {
                    tmp = tmp.right;
                }
            } else if (e.compareTo(tmp.e) < 0) {
                if (tmp.left == null) {
                    RookieNode node = new RookieNode(e);
                    tmp.left = node;
                    return;
                } else {
                    tmp = tmp.left;
                }
            } else {
                tmp.e = e;
                return;
            }
        }

    }

    /**
     * 非递归添加节点
     *
     * @param e
     */
    public void add2(E e) {
        if (root == null) {
            root = new RookieNode(e);
            size++;
            return;
        }
        RookieNode temp = root;
        RookieNode pre = root;
        while (temp != null) {
            pre = temp;
            if (e.compareTo(temp.e) < 0) {
                temp = temp.left;
            } else if (e.compareTo(temp.e) > 0) {
                temp = temp.right;
            } else {
                return;
            }
        }
        if (e.compareTo(temp.e) < 0)
            pre.left = new RookieNode(e);
        else
            pre.right = new RookieNode(e);
        size++;
    }


    private class RookieNode {

        public E e;

        public RookieNode left, right;


        public RookieNode(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }


    }


}
