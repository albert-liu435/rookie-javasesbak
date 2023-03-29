package com.rookie.bigdata.easy.A0067;

/**
 * @author rookie
 * @version 1.0
 * @date 2020/6/28 0:48
 */
public class Solution {
    public String addBinary(String a, String b) {
        int firstlength = a.length();
        int secodelength = b.length();
        int add = 0;
        StringBuffer str = new StringBuffer();
        //循环遍历字符串
        while (firstlength > 0 || secodelength > 0 || add != 0) {
            int x = firstlength > 0 ? a.charAt(firstlength - 1) - '0' : 0;
            int y = secodelength > 0 ? b.charAt(secodelength - 1) - '0' : 0;

            int sum = x + y + add;
            str.append(sum % 2);
            add = sum / 2;
            firstlength--;
            secodelength--;
        }

        str.reverse();
        return str.toString();
    }
}
