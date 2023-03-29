package com.rookie.bigdata.medium.A0008;

/**
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/23 14:37
 * @Version 1.0
 */
public class Solution {


    public int myAtoi(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        long result = 0;
        boolean isNegtive = false;
        str = str.trim();// 去掉首位空格
        for (int i = 0; i < str.length(); i++) {
            if (i == 0) {
                if (str.charAt(i) == '-') {
                    isNegtive = true;
                    continue;
                } else if (str.charAt(i) == '+') {
                    isNegtive = false;
                    continue;
                }
            }
            if (str.charAt(i) <= '9' && str.charAt(i) >= '0') {
                int number = str.charAt(i) - '0';
                result = result * 10 + number;
                if (!isNegtive) {
                    // 判断是否超限
                    if (result > Integer.MAX_VALUE) {
                        return Integer.MAX_VALUE;
                    }
                } else {
                    // 判断是否超限
                    if (result * -1 < Integer.MIN_VALUE) {
                        return Integer.MIN_VALUE;
                    }
                }
            }else {
                break;
            }
        }
        return isNegtive ? (int)result * -1 : (int)result;
    }
}
