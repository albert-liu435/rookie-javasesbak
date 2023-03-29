package com.rookie.bigdata.medium.A0094;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

/**
 * @ClassName Solution
 * @Description Solution
 * @Author liuxili
 * @Date 2020/10/22 10:39
 * @Version 1.0
 */
public class Solution {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(5);
        linkedList.add(6);

        TreeNode treeNode = createTreeNode(linkedList);

        List<Integer> list = inorderTraversal(treeNode);


    }


    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        inorder(root, res);
        return res;
    }

    public static void inorder(TreeNode root, List<Integer> res) {
        if (root == null) {
            return;
        }
        inorder(root.left, res);
        res.add(root.val);
        inorder(root.right, res);
    }

    public static TreeNode createTreeNode(LinkedList<Integer> nodeList) {
        TreeNode treeNode = null;
        if (nodeList == null || nodeList.isEmpty()) {
            return null;
        }
        Integer data = nodeList.removeFirst();

        if (data != null) {
            treeNode = new TreeNode(data);
            treeNode.left = createTreeNode(nodeList);
            treeNode.right = createTreeNode(nodeList);
        }

        return treeNode;


    }


    public static void preOrderTraveralWithStack(TreeNode node) {
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode treeNode = node;
        while (treeNode != null || !stack.isEmpty()) {
            //迭代访问节点的左孩子，并入栈
            while (treeNode != null) {
                System.out.print(treeNode.val + " ");
                stack.push(treeNode);
                treeNode = treeNode.left;
            }
            //如果节点没有左孩子，则弹出栈顶节点，访问节点右孩子
            if (!stack.isEmpty()) {
                treeNode = stack.pop();
                treeNode = treeNode.right;
            }
        }
    }
}
