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
    public boolean isCousins(TreeNode root, int x, int y) {
        int xLevel=level(root,x,0);
        int yLevel=level(root,y,0);
        if(!areSiblings(root,x,y)) {
            if(xLevel==yLevel) return true;
        }
        return false;
    }
    public boolean areSiblings(TreeNode root,int x,int y){
        if(root==null) return false;
        if(root.left!=null && root.right!=null){
            if(root.left.val==x&& root.right.val==y) return true;
            if(root.right.val==x && root.left.val==y) return true;
        }
        return areSiblings(root.left,x,y) || areSiblings(root.right,x,y);
    }
    public int level(TreeNode root,int x,int level){
        if(root==null) return -1;
        if(root.val==x) return level;
        int left=level(root.left,x,level+1);
        if(left!=-1) return left;
        return level(root.right,x,level+1);
    }
}