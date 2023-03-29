package com.rookie.bigdata.liuyubobobo.chapter03.loopqueue06;

public interface Queue<E> {

    int getSize();
    boolean isEmpty();
    void enqueue(E e);
    E dequeue();
    E getFront();
}
