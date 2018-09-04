package com.leet.tree;

import com.leet.tree.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {




    public static void main(String [] args){

        BinaryTreeInorderTraversal b = new BinaryTreeInorderTraversal();

        b.inorderTraversal(new TreeNode(1));
    }


    public List<Integer> inorderTraversal(TreeNode root) {

        List<Integer> inorder = new ArrayList<>();

        traversal(root, inorder);

        return inorder;
    }

    private void traversal(TreeNode root, List<Integer> inorder){

        if(root == null){
            return;
        }

        traversal(root.left, inorder);
        inorder.add(root.val);
        traversal(root.right, inorder);

    }

}
