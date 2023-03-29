package com.rookie.bigdata.liuyubobobo.chapter03.stackproblemleetcode03;

import java.util.Stack;

class Solution {


    public boolean isValid(String s){

        Stack<Character> stack=new Stack<>();

        for(int i=0;i<s.length();i++){

            char ch=s.charAt(i);
            if('('==ch || '{'==ch ||'['==ch){
                stack.push(ch);
            }else {
                if(stack.isEmpty()){
                    return false;
                }

                char topChar = stack.pop();
                if (ch == ')' && topChar != '(')
                    return false;
                if (ch == ']' && topChar != '[')
                    return false;
                if (ch == '}' && topChar != '{')
                    return false;


            }




        }




        return s.isEmpty();

    }

















//    public boolean isValid(String s) {
//
//        Stack<Character> stack = new Stack<>();
//        for(int i = 0 ; i < s.length() ; i ++){
//            char c = s.charAt(i);
//            if(c == '(' || c == '[' || c == '{')
//                stack.push(c);
//            else{
//                if(stack.isEmpty())
//                    return false;
//
//                char topChar = stack.pop();
//                if(c == ')' && topChar != '(')
//                    return false;
//                if(c == ']' && topChar != '[')
//                    return false;
//                if(c == '}' && topChar != '{')
//                    return false;
//            }
//        }
//        return stack.isEmpty();
//    }
//
//    public static void main(String[] args) {
//
//        System.out.println((new Solution()).isValid("()[]{}"));
//        System.out.println((new Solution()).isValid("([)]"));
//    }
}
