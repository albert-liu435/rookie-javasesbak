package com.rookie.bigdata.easy.A0509;

/**
 * 斐波那契数列
 *
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/22 14:35
 * @Version 1.0
 */
public class Solution {


    /**
     * 复杂度分析
     * <p>
     * 时间复杂度：O(2^N)O(2
     * N
     * )。这是计算斐波那契数最慢的方法。因为它需要指数的时间。
     * 空间复杂度：O(N)O(N)，在堆栈中我们需要与 N 成正比的空间大小。该堆栈跟踪 fib(N) 的函数调用，随着堆栈的不断增长如果没有足够的内存则会导致 StackOverflowError。
     * <p>
     * 作者：LeetCode
     * 链接：https://leetcode-cn.com/problems/fibonacci-number/solution/fei-bo-na-qi-shu-by-leetcode/
     * 来源：力扣（LeetCode）
     * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
     *
     * @param N
     * @return
     */
    public int fib(int N) {
        if (N == 0) {
            return 0;
        }
        if (N == 1 || N == 2) {
            return 1;
        }

        return fib(N - 1) + fib(N - 2);

    }


    /**
     * 复杂度分析
     * <p>
     * 时间复杂度：O(N)O(N)。
     * 空间复杂度：O(N)O(N)，使用了空间大小为 N 的数组。
     *
     * @param N
     * @return
     */
    public int fib1(int N) {
        if (N <= 1) {
            return N;
        }
        return memoize(N);
    }

    public int memoize(int N) {
        int[] cache = new int[N + 1];
        cache[1] = 1;

        for (int i = 2; i <= N; i++) {
            cache[i] = cache[i - 1] + cache[i - 2];
        }
        return cache[N];
    }


}
