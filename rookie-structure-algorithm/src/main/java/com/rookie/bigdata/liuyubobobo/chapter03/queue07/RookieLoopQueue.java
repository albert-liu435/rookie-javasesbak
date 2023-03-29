package com.rookie.bigdata.liuyubobobo.chapter03.queue07;

/**
 * @Classname RookieLoopQueue
 * @Description TODO
 * @Author rookie
 * @Date 2021/8/16 15:37
 * @Version 1.0
 */
public class RookieLoopQueue<E> implements Queue<E> {

    private E[] data;
    private int front, tail;
//tail+1==front 表示队列已经满了，有意识的浪费一个空间
    private int size;

    public RookieLoopQueue(int capacity){
        data = (E[])new Object[capacity + 1];
        front = 0;
        tail = 0;
        size = 0;
    }

    public int getCapacity(){
        return data.length - 1;
    }

    public RookieLoopQueue(){
        this(10);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return front==tail;
    }

    @Override
    public void enqueue(E e) {

    }

    @Override
    public E dequeue() {
        return null;
    }

    @Override
    public E getFront() {
        return null;
    }
}
