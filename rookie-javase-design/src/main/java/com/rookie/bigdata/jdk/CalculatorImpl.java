package com.rookie.bigdata.jdk;

/**
 * @Classname CalculatorImpl
 * @Description TODO
 * @Author rookie
 * @Date 2021/9/3 16:11
 * @Version 1.0
 */
/**
 * 目标对象实现类，实现Calculator接口
 */
public class CalculatorImpl implements Calculator {

    //加
    public int add(int a, int b) {
        int result = a + b;
        return result;
    }

    //减
    public int subtract(int a, int b) {
        int result = a - b;
        return result;
    }

    //乘法、除法...
}
