package com.datastrcutures.trees;
public class MergeBinaryTrees {
    static class TreeNode {
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
    static void Inorder(TreeNode node){
        if(node==null){
            return ;
        }
        Inorder(node.left);
        System.out.println(node.val+"");
        Inorder(node.right);
    }

    static  TreeNode mergeTrees(TreeNode t1, TreeNode t2){
        if(t1== null){
            return t2;

        }
        if(t2==null){
            return t1;
        }
        t1.val+=t2.val;
        t1.left=mergeTrees(t1.left,t2.left);
        t1.right=mergeTrees(t1.right,t2.right);
        return t1;
    }
    public static void main(String args[]){
            //for mergin
      //once you merge do inorder traversal for the merged tree
    }





}
