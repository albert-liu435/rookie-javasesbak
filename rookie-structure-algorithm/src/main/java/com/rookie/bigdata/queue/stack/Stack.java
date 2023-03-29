package com.rookie.bigdata.queue.stack;

/**
 * @Classname Stack
 * https://blog.csdn.net/javazejian/article/details/53362993
 * @Description 栈接口抽象数据类型
 * @Author rookie
 * @Date 2021/8/3 15:16
 * @Version 1.0
 */
public interface Stack<E> {

    int getSize();

    /**
     * 栈是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * e元素入栈
     *
     * @param e
     */
    void push(E e);

    /**
     * 出栈,返回栈顶元素,同时从栈中移除该元素
     *
     * @return
     */
    E pop();

    /**
     * 返回栈顶元素,未出栈
     *
     * @return
     */
    E peek();
}
