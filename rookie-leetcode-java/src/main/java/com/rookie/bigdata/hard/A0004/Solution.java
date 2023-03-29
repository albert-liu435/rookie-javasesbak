package com.rookie.bigdata.hard.A0004;

/**
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/20 17:52
 * @Version 1.0
 */
public class Solution {

    /**
     * https://segmentfault.com/a/1190000024144717
     * <p>
     * 时间复杂度O(m+n), 空间复杂度O(1)
     * 双指针法：如果两个数组的和为偶数的话，则需遍历len/2 + 1次， 如果为奇数，则需遍历Math.floor(len/2) + 1次，
     * * 使用prev和current来分别记录上一轮循环和该轮循环的值
     *
     * @param nums1
     * @param nums2
     * @return
     */
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length, n = nums2.length;
        int len = m + n;
        double prev = -1, current = -1;
        int aStart = 0, bStart = 0; //prev保存上一轮循环的结果，current保存当前循环的结果，aStart表示nums1的指针，bStart表示nums2的指针

        for (int i = 0; i <= len / 2 ; i++) {

            prev = current; //prev指向上一轮循环的值
            //nums1指针向后移的条件： aStart < m 且 nums1[aStart] < nums2[bStart]，但是第二个条件的前提条件是nums2的指针不能越界
            if (aStart < m && (bStart >= n || nums1[aStart] < nums2[bStart])) {
                current = nums1[aStart++];
            } else {
                current = nums2[bStart++];
            }


        }

        if (len % 2 == 0) {
            return (prev + current) / 2;
        } else {
            return current;
        }


    }

}
