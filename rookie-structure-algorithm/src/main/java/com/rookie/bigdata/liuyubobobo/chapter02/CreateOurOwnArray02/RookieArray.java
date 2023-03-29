package com.rookie.bigdata.liuyubobobo.chapter02.CreateOurOwnArray02;

/**
 * @Classname RookieArray
 * @Description TODO
 * @Author rookie
 * @Date 2021/8/5 11:02
 * @Version 1.0
 */
public class RookieArray {

    private int[] data;

    private int size;

    public RookieArray(int capacity) {
        //容量
        data = new int[capacity];
        //数组中的实际元素数量
        this.size = 0;
    }

    public RookieArray() {
        this(10);
    }

    public int getCapacity() {

        return data.length;
    }

    public int getSize() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }


}
