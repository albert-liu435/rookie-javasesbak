package com.rookie.bigdata.sync;

/**
 * @Classname SynchronizedByteClass
 * @Description TODO
 * @Author rookie
 * @Date 2021/8/30 17:04
 * @Version 1.0
 */
public class SynchronizedByteClass {


    Object objMonitor = new Object();

    public synchronized void method1() {
        System.out.println("Hello synchronized 1");
    }

    public synchronized static void method2() {
        System.out.println("Hello synchronized 2");
    }

    public void method3() {
        synchronized (objMonitor) {
            System.out.println("Hello synchronized 2");
        }
    }

    public static void main(String[] args) {

    }


}
