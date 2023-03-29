package com.rookie.bigdata.liuyubobobo.chapter08.ch02;

public class MaxHeap<E extends Comparable<E>> {


    private Array<E> data;

    private MaxHeap(int capacity) {
        this.data = new Array<>(capacity);
    }

    private MaxHeap() {
        this.data = new Array<>();
    }


    public int size() {
        return data.getSize();
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }


    public int parent(int index) {
        if (index <= 0) {
            throw new IllegalArgumentException("index-0 doesn't have parent.");
        }
        return (index - 1) / 2;
    }

    public int leftChild(int index) {

        return index * 2 + 1;
    }

    public int rightChild(int index) {
        return index * 2 + 2;
    }

//    private Array<E> data;
//
//    public MaxHeap(int capacity){
//        data = new Array<>(capacity);
//    }
//
//    public MaxHeap(){
//        data = new Array<>();
//    }
//
//    // 返回堆中的元素个数
//    public int size(){
//        return data.getSize();
//    }
//
//    // 返回一个布尔值, 表示堆中是否为空
//    public boolean isEmpty(){
//        return data.isEmpty();
//    }
//
//    // 返回完全二叉树的数组表示中，一个索引所表示的元素的父亲节点的索引
//    private int parent(int index){
//        if(index == 0)
//            throw new IllegalArgumentException("index-0 doesn't have parent.");
//        return (index - 1) / 2;
//    }
//
//    // 返回完全二叉树的数组表示中，一个索引所表示的元素的左孩子节点的索引
//    private int leftChild(int index){
//        return index * 2 + 1;
//    }
//
//    // 返回完全二叉树的数组表示中，一个索引所表示的元素的右孩子节点的索引
//    private int rightChild(int index){
//        return index * 2 + 2;
//    }

}
