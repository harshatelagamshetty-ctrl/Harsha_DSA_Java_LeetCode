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
    static int binaryTilt=0;
    public int findTilt(TreeNode root){
        binaryTilt=0;
        int TreeSum=sum(root);
        return binaryTilt;
    }
    public int sum(TreeNode root){
        if(root==null) return 0;
        int leftSum=sum(root.left);
        int rightSum=sum(root.right);
        binaryTilt+=Math.abs(leftSum-rightSum);
        return leftSum+rightSum+root.val;
    }
}