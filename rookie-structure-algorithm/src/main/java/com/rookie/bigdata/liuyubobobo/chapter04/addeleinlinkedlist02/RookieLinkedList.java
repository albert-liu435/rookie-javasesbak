package com.rookie.bigdata.liuyubobobo.chapter04.addeleinlinkedlist02;


/**
 * @Classname RookieLinkedList
 * @Description TODO
 * @Author rookie
 * @Date 2021/8/17 10:49
 * @Version 1.0
 */
public class RookieLinkedList<E> {


    private Node head;

    private int size;

    public RookieLinkedList() {
        this.head = null;
        this.size = 0;
    }

    private int getSize() {
        return this.size;
    }

    public boolean isEmpty() {
        return this.size == 0;
    }

    public void addFist(E e) {
//        Node newNode=new Node(e);
//        newNode.next=head;
//        head=newNode;

        head = new Node(e, head.next);
        size++;


    }

    public void add(int index,E e){

        if(index<0 || index >size){
            throw new IllegalArgumentException("传入的参数有问题");
        }

        if(index ==0){
            addFist(e);
        }else {
                Node pre=head;
            for(int i=1;i<index;i++){
                pre=pre.next;
            }
            pre.next=new Node(e,pre.next);

            size++;



        }




    }

    // 在链表末尾添加新的元素e
    public void addLast(E e){
        add(size, e);
    }



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
