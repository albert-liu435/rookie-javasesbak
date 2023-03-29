package com.rookie.bigdata.liuyubobobo.chapter09.ch03;

public class SegmentTree<E> {

    private E[] tree;
    private E[] data;
    private Merger<E> merger;

    public SegmentTree(E[] arr, Merger<E> merger){

        this.merger = merger;

        data = (E[])new Object[arr.length];
        for(int i = 0 ; i < arr.length ; i ++)
            data[i] = arr[i];

        tree = (E[])new Object[4 * arr.length];

        buildSegmentTree(0, 0, arr.length - 1);
    }

    // 在treeIndex的位置创建表示区间[l...r]的线段树;treeIndex:根节点对应的索引,l:节点代表的线段的左端点，r:代表的线段的右端点
    private void buildSegmentTree(int treeIndex, int l, int r){

        //代表只有一个元素
        if(l == r){
            tree[treeIndex] = data[l];
            return;
        }
        //左节点
        int leftTreeIndex = leftChild(treeIndex);
        //右节点
        int rightTreeIndex = rightChild(treeIndex);

        //当l和r比较大的情况下，l + r 有可能会出现整形溢出
        // int mid = (l + r) / 2;
        int mid = l + (r - l) / 2;

        buildSegmentTree(leftTreeIndex, l, mid);
        buildSegmentTree(rightTreeIndex, mid + 1, r);

       // tree[treeIndex] = tree[leftTreeIndex]+tree[rightTreeIndex];

        tree[treeIndex] = merger.merge(tree[leftTreeIndex], tree[rightTreeIndex]);
    }

    public int getSize(){
        return data.length;
    }

    public E get(int index){
        if(index < 0 || index >= data.length)
            throw new IllegalArgumentException("Index is illegal.");
        return data[index];
    }

    // 返回完全二叉树的数组表示中，一个索引所表示的元素的左孩子节点的索引
    private int leftChild(int index){
        return 2*index + 1;
    }

    // 返回完全二叉树的数组表示中，一个索引所表示的元素的右孩子节点的索引
    private int rightChild(int index){
        return 2*index + 2;
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append('[');
        for(int i = 0 ; i < tree.length ; i ++){
            if(tree[i] != null)
                res.append(tree[i]);
            else
                res.append("null");

            if(i != tree.length - 1)
                res.append(", ");
        }
        res.append(']');
        return res.toString();
    }
}
