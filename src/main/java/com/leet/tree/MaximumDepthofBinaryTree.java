package com.leet.tree;

public class MaximumDepthofBinaryTree {

    public int maxDepth(TreeNode root) {

        if(root == null){
            return 0;
        }

        int len = 0;

        len = maxDeep(root);

        return len;
    }

    private int maxDeep(TreeNode root) {

        if(root == null){
            return 0;
        }
        int left = 0;
        int right = 0;
        left = maxDeep(root.left) + 1;
        right = maxDeep(root.right) + 1;

        return (left > right) ? left : right;
    }


    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

}
