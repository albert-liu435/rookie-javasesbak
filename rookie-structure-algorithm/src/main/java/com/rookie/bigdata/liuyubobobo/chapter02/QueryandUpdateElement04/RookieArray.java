package com.rookie.bigdata.liuyubobobo.chapter02.QueryandUpdateElement04;

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

    // 构造函数，传入数组的容量capacity构造Array
    public RookieArray(int capacity) {
        data = new int[capacity];
        size = 0;
    }

    // 无参数的构造函数，默认数组的容量capacity=10
    public RookieArray() {
        this(10);
    }

    // 获取数组的容量
    public int getCapacity() {
        return data.length;
    }

    // 获取数组中的元素个数
    public int getSize() {
        return size;
    }

    // 返回数组是否为空
    public boolean isEmpty() {
        return size == 0;
    }


    public void addLas(int e) {
        add(size, e);

    }

    // 在所有元素前添加一个新元素
    public void addFirst(int e) {
        add(0, e);
    }

    public void add(int index, int e) {
        if (size == data.length) {
            throw new IllegalArgumentException("AddLast failed. Array is full.");
        }

        if (index < 0 || index > size)
            throw new IllegalArgumentException("Add failed. Require index >= 0 and index <= size.");

        for (int i = size - 1; i >= index; i--) {
            data[i + 1] = data[i];
        }
        data[size] = e;
        size++;

    }

    // 获取index索引位置的元素
    public int get(int index) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Get failed. Index is illegal.");
        return data[index];
    }

    // 修改index索引位置的元素为e
    public void set(int index, int e) {
        if (index < 0 || index >= size)
            throw new IllegalArgumentException("Set failed. Index is illegal.");
        data[index] = e;
    }

    @Override
    public String toString() {

        StringBuilder res = new StringBuilder();
        res.append(String.format("Array: size = %d , capacity = %d\n", size, data.length));
        res.append('[');
        for (int i = 0; i < size; i++) {
            res.append(data[i]);
            if (i != size - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }

}
