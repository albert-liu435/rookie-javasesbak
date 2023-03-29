package com.rookie.bigdata.medium.A0144;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/22 11:55
 * @Version 1.0
 */
public class Solution {


    public List<Integer> preorderTraversal(TreeNode root) {

        List<Integer> list = new ArrayList<>();

        preOrder(root, list);

        return list;

    }

    public void preOrder(TreeNode root, List<Integer> list) {

        if (root == null) {
            return;
        }
        list.add(root.val);
        preOrder(root.left, list);
        preOrder(root.right, list);


    }

    public List<Integer> preorderTraversal1(TreeNode root) {

        List<Integer> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        TreeNode treeNode = root;

        while (!stack.isEmpty() || treeNode != null) {

            while (treeNode != null) {

                list.add(treeNode.val);
                stack.push(treeNode);
                treeNode = treeNode.left;

            }

            if (stack != null) {

                treeNode = stack.pop();
                treeNode = treeNode.right;
            }

        }

        return list;


    }
}
