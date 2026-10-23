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
    static int max=0;
    public int diameterOfBinaryTree(TreeNode root) {
        max=0;
        levels(root);
        return max;
    }
    public int levels(TreeNode root){
        if(root==null) return 0;
        int leftLevels=levels(root.left);
        int rightLevels=levels(root.right);
        if(leftLevels+rightLevels>max) max=leftLevels+rightLevels;
        return 1+Math.max(leftLevels,rightLevels);
    }
}