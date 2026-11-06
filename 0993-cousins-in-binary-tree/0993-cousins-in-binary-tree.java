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
    public static boolean isCousins(TreeNode root, int a, int b) {
        boolean siblings= areSiblings(root,a,b);
        int l1=level(root,a,0);
        int l2=level(root,b,0);
        boolean isSameLevel;
        isSameLevel= l1 == l2;
        return !areSiblings(root,a,b) && isSameLevel;

    }
    private static boolean areSiblings(TreeNode root, int a, int b) {
        if(root==null) return false;
        if(root.left!=null && root.right!=null){
            if(root.left.val==a && root.right.val==b) return true;
            if(root.left.val==b && root.right.val==a) return true;
        }
        return areSiblings(root.left,a,b) || areSiblings(root.right,a,b);
    }
    public static int level(TreeNode root,int val,int l){
        if(root==null) return -1;
        if(root.val==val) return l;
        int left=level(root.left,val,l+1);
        if(left!=-1) return left;
        return level(root.right,val,l+1);
    }
}