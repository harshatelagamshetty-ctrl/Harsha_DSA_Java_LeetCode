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
    public boolean isSymmetric(TreeNode root) {
        TreeNode n=copyTree(root);
        invert(root);
        return sameTree(n,root);
    }
    public void invert(TreeNode root){
        if(root==null) return;
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        invert(root.left);
        invert(root.right);
    }
    
    public boolean sameTree(TreeNode p,TreeNode q){
        if(p==null && q==null) return true;
        if(p==null || q==null) return false;
        if(p.val!=q.val) return false;
        if(!sameTree(p.left,q.left)) return false;
        if(!sameTree(p.right,q.right)) return false;
        return true;
    }
    public TreeNode copyTree(TreeNode root){
        if(root==null) return null;
        TreeNode temp=new TreeNode(root.val);
        temp.left=copyTree(root.left);
        temp.right=copyTree(root.right);
        return temp;
    }
}