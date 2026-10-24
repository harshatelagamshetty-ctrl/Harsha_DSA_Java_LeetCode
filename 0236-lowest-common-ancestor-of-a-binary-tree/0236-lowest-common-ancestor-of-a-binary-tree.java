/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        boolean pInLeft=isPresent(root.left,p.val); 
        boolean qInLeft=isPresent(root.left,q.val);
        if(root.val==p.val || root.val==q.val) return root;
        if(pInLeft && !qInLeft) return root;
        if(!pInLeft && qInLeft) return root;
        if(pInLeft && qInLeft) return lowestCommonAncestor(root.left,p,q);
        if(!pInLeft && !qInLeft) return lowestCommonAncestor(root.right,p,q);
        return root;
    }
    public boolean isPresent(TreeNode root,int val){
        if(root==null) return false;
        if(root.val==val) return true;
        return isPresent(root.left,val) || isPresent(root.right,val);
    }
}