package com.rookie.bigdata.medium.A0050;

/**
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/21 17:10
 * @Version 1.0
 */
public class Solution {

    public static void main(String[] args) {
        Solution solution=new Solution();
        solution.myPow(10,3);

    }


    public double quickMul(double x, long N) {
        if (N == 0) {
            return 1.0;
        }
        double y = quickMul(x, N / 2);
        return N % 2 == 0 ? y * y : y * y * x;
    }

    public double myPow(double x, int n) {
        long N = n;
        return N >= 0 ? quickMul(x, N) : 1.0 / quickMul(x, -N);
    }
}
