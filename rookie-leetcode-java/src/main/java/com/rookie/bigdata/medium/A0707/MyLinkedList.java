package com.rookie.bigdata.medium.A0707;

/**
 * @ClassName MyLinkedList
 * @Description MyLinkedList
 * @Author liuxili
 * @Date 2020/10/16 14:11
 * @Version 1.0
 */
class MyLinkedList {

    private Node dummyHead;
    private int size;

    /** Initialize your data structure here. */
    public MyLinkedList() {
        dummyHead=new Node(null,null);
        size=0;

    }

    /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
    public int get(int index) {
        if(index <0 || index >size){
            return -1;
        }

        Node prev=dummyHead;
        for(int i=0;i<index;i++){
            prev=prev.next;
        }

        return prev.next.val;



    }

    /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
    public void addAtHead(int val) {
        addAtIndex(0,val);

    }

    /** Append a node of value val to the last element of the linked list. */
    public void addAtTail(int val) {

        addAtIndex(size,val);

    }

    /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
    public void addAtIndex(int index, int val) {

        if(index <0 || index >size){
            throw new IllegalArgumentException("Add failed. Illegal index.");
        }
        size++;
        Node prev=dummyHead;

        for(int i=0;i<index;i++){
            prev=prev.next;
        }

        prev.next=new Node(val,prev.next);




    }

    /** Delete the index-th node in the linked list, if the index is valid. */
    public void deleteAtIndex(int index) {
        if(index <0 || index >size){
            return;
        }
        Node prev=dummyHead;
        for(int i=0;i<index;i++){
            prev=prev.next;
        }
        //删除的是prev.next这个节点

        prev.next=prev.next.next;
        size--;


    }


    private class Node{
        Integer val;
        Node next;

        public Node(){
            this(null,null);
        }
        public Node(Integer val){
            this(val,null);

        }
        public Node(Integer val,Node next){
            this.val=val;
            this.next=next;
        }


    }


    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.addAtHead(1);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(1,2);   //链表变为1-> 2-> 3
        linkedList.get(1);            //返回2
        System.out.println(linkedList.get(1));
        linkedList.deleteAtIndex(1);  //现在链表是1-> 3
        linkedList.get(1);            //返回3




    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */