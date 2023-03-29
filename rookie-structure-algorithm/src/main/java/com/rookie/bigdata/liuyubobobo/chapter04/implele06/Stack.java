package com.rookie.bigdata.liuyubobobo.chapter04.implele06;

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);
    E pop();
    E peek();
}
