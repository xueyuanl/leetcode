package com.leet.tree;

import com.leet.tree.base.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BinaryTreeLevelOrderTraversal {

    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> lists = new ArrayList<>();

        if (root == null) {
            return lists;
        }

        Deque<TreeNode> queue = new ArrayDeque<>();

        Deque<TreeNode> child = new ArrayDeque<>();

        queue.addLast(root);

        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode node = queue.getFirst();
            list.add(node.val);
            queue.removeFirst();

            if(node.left != null){
                child.addLast(node.left);
            }
            if (node.right != null) {
                child.addLast(node.right);
            }

            if (queue.isEmpty()) {
                lists.add(list);
                list = new ArrayList<>();
                queue = child;
                child = new ArrayDeque<>();
            }
        }

        return lists;
    }
}