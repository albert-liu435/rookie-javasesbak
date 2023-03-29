package com.rookie.bigdata.medium.A0144;

/**
 * @ClassName TreeNode
 * @Description TreeNode
 * @Author liuxili
 * @Date 2020/10/22 10:39
 * @Version 1.0
 */
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
