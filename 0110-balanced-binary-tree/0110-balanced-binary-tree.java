/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    static boolean flag;
    public boolean isBalanced(TreeNode root) {
        flag=true;
        int h=height(root);
        return flag;
    }
    public static int height(TreeNode root){
        if(root==null) return 0;
        int leftTree=height(root.left);
        int rightTree=height(root.right);
        if(Math.abs(leftTree-rightTree)>1) flag=false;
        return 1+Math.max(leftTree,rightTree);
    }
}