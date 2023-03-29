package com.rookie.bigdata.liuyubobobo.chapter04.queue07;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
