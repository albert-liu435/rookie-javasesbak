package com.rookie.bigdata.queue.queue;

/**
 * @Classname Queue
 * @Description https://blog.csdn.net/javazejian/article/details/53375004
 * @Author rookie
 * @Date 2021/8/3 15:28
 * @Version 1.0
 */
public interface Queue<E> {

    /**
     * 队列中的元素个数
     *
     * @return
     */
    int getSize();

    /**
     * 队列是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 队列中添加元素
     *
     * @param e
     */
    void enqueue(E e);

    /**
     * 删除队列中的第一个元素
     *
     * @return
     */
    E dequeue();

    /**
     * 获取头部元素
     *
     * @return
     */
    E getFront();
}
