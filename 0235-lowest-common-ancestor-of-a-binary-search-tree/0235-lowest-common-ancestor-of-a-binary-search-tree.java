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
        public TreeNode lowestCommonAncestor(TreeNode root, TreeNode a, TreeNode b) {
        int p=a.val;
        int q=b.val;
        if(root==null) return null;
        if(root.val==p || root.val==q) return root;
        if(root.val>p && root.val<q) return root;
        if(root.val>p && root.val>q) return lowestCommonAncestor(root.left,a,b);
        else if(root.val<p && root.val<q) return lowestCommonAncestor(root.right,a,b);
        return root;
    }
}