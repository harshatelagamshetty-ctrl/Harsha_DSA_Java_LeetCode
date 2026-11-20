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
package BINARY_SEARCH_TREES;

public class RangeSumInBST {
    static int sum;
    public int rangeSumBST(TreeNode root, int low, int high) {
        // inclusive
        sum=0;
        calculate(root,low,high);
        return sum;
    }
    public void calculate(TreeNode root,int low,int high){
        if(root==null) return;
        if(root.val>=low && root.val<=high) sum+=root.val;
        calculate(root.left,low,high);
        calculate(root.right,low,high);
    }
}
