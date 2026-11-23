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
    public static class Pair{
        long min;
        long max;
        Pair(long max,long min){
            this.max=max;
            this.min=min;
        }
    }
    public boolean isValidBST(TreeNode root){
        flag=true;
        Pair res=maxMin(root);
        return flag;
    }
    public Pair maxMin(TreeNode root){
        if(root==null) return new Pair(Long.MIN_VALUE,Long.MAX_VALUE);
        Pair lst=maxMin(root.left);
        Pair rst=maxMin(root.right);
        if(root.val<=lst.max || root.val>=rst.min) flag=false;
        long max=Math.max(root.val,Math.max(lst.max,rst.max));
        long min=Math.min(root.val,Math.min(lst.min,rst.min));
        return new Pair(max,min);
    }
}