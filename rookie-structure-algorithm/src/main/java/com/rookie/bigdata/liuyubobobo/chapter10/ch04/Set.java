package com.rookie.bigdata.liuyubobobo.chapter10.ch04;

public interface Set<E> {

    void add(E e);
    boolean contains(E e);
    void remove(E e);
    int getSize();
    boolean isEmpty();
}
