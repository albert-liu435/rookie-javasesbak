package com.rookie.bigdata.liuyubobobo.chapter03.array_stack02;

public interface Stack<E> {

    /**
     * 获取栈的数量
     *
     * @return
     */
    int getSize();

    /**
     * 判断是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 向栈中添加元素
     *
     * @param e
     */
    void push(E e);

    /**
     * 获取栈顶元素，并删除栈顶元素
     *
     * @return
     */
    E pop();

    /**
     * 获取栈顶元素
     *
     * @return
     */
    E peek();
}
