package com.rookie.bigdata.liuyubobobo.chapter08.ch06;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
