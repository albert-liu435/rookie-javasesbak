package com.rookie.bigdata.medium.A0006;


import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/23 11:01
 * @Version 1.0
 */
public class Solution {


    public String convert(String s, int numRows) {

        if (numRows == 1) return s;

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++)
            rows.add(new StringBuilder());

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) ret.append(row);
        return ret.toString();
    }



    public String convert1(String s, int numRows) {
        //行数为1的时候返回    
        if(numRows==1){
                return  s;
            }
        
        List<StringBuilder> list=new ArrayList<>();

        boolean isDown=false;
        
        int num=Math.min(s.length(),numRows);
        
        //有这么多的StringBuilder对象
        for(int i=0;i<num;i++){
            list.add(new StringBuilder());
        }
        
        int k = 0;
        char [] charArray=s.toCharArray();
        
        for(int j=0;j<charArray.length;j++){
            
            list.get(k).append(charArray[j]);
            
            if(k==0 || k==numRows-1){
                isDown=!isDown;
            }
            
            if(isDown){
                k++;
            }else {
                k--;
            }
        }
        
        StringBuilder st=new StringBuilder();
        for (StringBuilder stringBuilder : list) {
            st.append(stringBuilder);
        }
        
        return st.toString();
        
        
        
        
        
            
    }
}
