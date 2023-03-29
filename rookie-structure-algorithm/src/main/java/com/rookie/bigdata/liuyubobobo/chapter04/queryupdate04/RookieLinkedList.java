package com.rookie.bigdata.liuyubobobo.chapter04.queryupdate04;


/**
 * @Classname RookieLinkedList
 * @Description TODO
 * @Author rookie
 * @Date 2021/8/17 10:49
 * @Version 1.0
 */
public class RookieLinkedList<E> {


    private Node dummyHead;

    private int size;

    public RookieLinkedList() {
        this.dummyHead = new Node();
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

//        dummyHead = new Node(e, dummyHead.next);
//        size++;
        add(0,e);


    }

    public void add(int index,E e){

        if(index<0 || index >size){
            throw new IllegalArgumentException("传入的参数有问题");
        }

//        if(index ==0){
//            addFist(e);
//        }else {
                Node pre=dummyHead;
            for(int i=0;i<index;i++){
                pre=pre.next;
            }
            pre.next=new Node(e,pre.next);

            size++;



       // }




    }

    // 获得链表的第index(0-based)个位置的元素
    // 在链表中不是一个常用的操作，练习用：）
    public E get(int index){

        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Illegal index.");

        Node cur = dummyHead.next;
        for(int i = 0 ; i < index ; i ++)
            cur = cur.next;
        return cur.e;
    }

    // 在链表末尾添加新的元素e
    public void addLast(E e){
        add(size, e);
    }



    // 获得链表的第一个元素
    public E getFirst(){
        return get(0);
    }

    // 获得链表的最后一个元素
    public E getLast(){
        return get(size - 1);
    }

    // 修改链表的第index(0-based)个位置的元素为e
    // 在链表中不是一个常用的操作，练习用：）
    public void set(int index, E e){
        if(index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Illegal index.");

        Node cur = dummyHead.next;
        for(int i = 0 ; i < index ; i ++)
            cur = cur.next;
        cur.e = e;
    }

    // 查找链表中是否有元素e
    public boolean contains(E e){
        Node cur = dummyHead.next;
        while(cur != null){
            if(cur.e.equals(e))
                return true;
            cur = cur.next;
        }
        return false;
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
