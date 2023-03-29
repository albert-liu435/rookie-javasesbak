package com.rookie.bigdata.medium.A0372;

import java.util.LinkedList;

/**
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/21 17:39
 * @Version 1.0
 */
public class Solution {

    public static void main(String[] args) {

        Solution solution=new Solution();
        System.out.println(solution.superPow(2, new int[]{3}));
    }
        public int superPow(int a, int[] b) {
            int N=0;
            for(int i=0;i<b.length;i++){
                N+=b[i] * myPow(10,b.length-i-1);
            }

            return myPow(a,N);
        }

        public int myPow(int p,int N){

            //
            if(N==0){
                return 1;
            }
            int y=myPow(p,N/2);

            return N%2==0? y*y: y*y*p;

        }

}
