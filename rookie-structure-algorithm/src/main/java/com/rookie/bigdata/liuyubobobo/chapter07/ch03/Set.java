package com.rookie.bigdata.liuyubobobo.chapter07.ch03;

public interface Set<E> {

    void add(E e);
    boolean contains(E e);
    void remove(E e);
    int getSize();
    boolean isEmpty();
}
