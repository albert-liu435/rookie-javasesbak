package com.rookie.bigdata.queue.stack;

/**
 * @Classname Main
 * @Description TODO
 * @Author rookie
 * @Date 2021/8/3 15:22
 * @Version 1.0
 */
public class Main {

    public static void main(String[] args) {

        ArrayStack<Integer> stack = new ArrayStack<>();

        for (int i = 0; i < 5; i++) {
            stack.push(i);
            System.out.println(stack);
        }

        stack.pop();
        System.out.println(stack);
    }
}
