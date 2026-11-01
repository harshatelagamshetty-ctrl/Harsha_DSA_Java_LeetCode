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
    public int sumOfLeftLeaves(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        addLeaves(list,root);
        int sum=0;
        for(int i=0;i<list.size();i++) sum+=list.get(i);
        return sum;
    }
    public static void addLeaves(List<Integer>list,TreeNode root){
        if(root==null) return;
        if(root.left!=null && root.left.left==null && root.left.right==null) list.add(root.left.val);
        addLeaves(list,root.left);
        addLeaves(list,root.right);
    }
}