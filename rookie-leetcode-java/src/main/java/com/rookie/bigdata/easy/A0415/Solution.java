package com.rookie.bigdata.easy.A0415;

/**
 * 字符串相加
 *
 * 给定两个字符串形式的非负整数 num1 和num2 ，计算它们的和。
 * <p>
 *  
 * <p>
 * 提示：
 * <p>
 * num1 和num2 的长度都小于 5100
 * num1 和num2 都只包含数字 0-9
 * num1 和num2 都不包含任何前导零
 * 你不能使用任何內建 BigInteger 库， 也不能直接将输入的字符串转换为整数形式
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/add-strings
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/16 15:52
 * @Version 1.0
 */
public class Solution {

    public String addStrings(String num1, String num2) {
        int firstlength = num1.length();
        int secodelength = num2.length();
        int add = 0;
        StringBuffer str = new StringBuffer();
        //循环遍历字符串
        while (firstlength > 0 || secodelength > 0 || add != 0) {
            int x = firstlength > 0 ? num1.charAt(firstlength - 1) - '0' : 0;
            int y = secodelength > 0 ? num2.charAt(secodelength - 1) - '0' : 0;

            int sum = x + y + add;
            str.append(sum % 10);
            add = sum / 10;
            firstlength--;
            secodelength--;
        }

        str.reverse();
        return str.toString();
    }
}
