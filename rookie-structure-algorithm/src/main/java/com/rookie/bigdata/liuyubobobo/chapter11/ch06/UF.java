package com.rookie.bigdata.liuyubobobo.chapter11.ch06;

public interface UF {

    int getSize();
    boolean isConnected(int p, int q);
    void unionElements(int p, int q);
}
