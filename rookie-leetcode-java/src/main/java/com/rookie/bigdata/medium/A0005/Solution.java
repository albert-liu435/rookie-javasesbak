package com.rookie.bigdata.medium.A0005;

/**
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/21 10:11
 * @Version 1.0
 */
public class Solution {

    public static void main(String[] args) {

        Solution solution = new Solution();
        solution.longestPalindrome("ababa");


    }



    //动态规划
    public String longestPalindrome4(String s) {
        // 特判，小于2说明只有一个字符串串，所以是回文串
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;

        // dp[i][j] 表示 s[i, j] 是否是回文串
        boolean[][] dp = new boolean[len][len];
            char[] charArray = s.toCharArray();
        //二维表的对角线都为true
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        //j表示字符串j的位置，j也代表x轴
        for (int j = 1; j < len; j++) {
            //i表示字符串j之前的位置，i也可以代表是y轴
            for (int i = 0; i < j; i++) {
                if (charArray[i] != charArray[j]) {
                    dp[i][j] = false;
                } else {
                    if (j - i < 3) {
                        dp[i][j] = true;
                    } else {
                        dp[i][j] = dp[i + 1][j - 1];
                    }
                }

                // 只要 dp[i][j] == true 成立，就表示子串 s[i..j] 是回文，此时记录回文长度和起始位置
                if (dp[i][j] && j - i + 1 > maxLen) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }
        return s.substring(begin, begin + maxLen);
    }


    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[n][n];
        String ans = "";
        for (int l = 0; l < n; ++l) {
            for (int i = 0; i + l < n; ++i) {
                //j相当于长度
                int j = i + l;
                if (l == 0) { //这个相当于在对角线上都为true
                    dp[i][j] = true;
                } else if (l == 1) {//长度为2的字符串
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    //动态规划转移方程
                    dp[i][j] = (s.charAt(i) == s.charAt(j) && dp[i + 1][j - 1]);
                }
                //获取最长长度
                if (dp[i][j] && l + 1 > ans.length()) {
                    //截取最长长度
                    ans = s.substring(i, i + l + 1);
                }
            }
        }
        return ans;
    }

    //暴力解法
    public String longestPalindrome1(String s) {
        int len = s.length();
        if (len < 2) {
            return s;
        }

        int maxLen = 1;
        int begin = 0;
        //s.charAt(i)每次都会检查数组下标越界,因此先转换成字符数组，这一步非必须
        char[] charArray = s.toCharArray();
        //枚举所有长度严格大于1的子串,charArray[i..j]
        for (int i = 0; i < len - 1; i++) {
            for (int j = i + 1; j < len; j++) {
                if (j - i + 1 > maxLen && validPalindromic(charArray, i, j)) {
                    maxLen = j - i + 1;
                    begin = i;
                }
            }
        }

        return s.substring(begin, begin + maxLen);
    }

    //验证子串是否为回文串
    public boolean validPalindromic(char[] charArray, int left, int right) {
        while (left < right) {
            if (charArray[left] != charArray[right]) {
                return false;
            }

            left++;
            right--;
        }
        return true;
    }
}
