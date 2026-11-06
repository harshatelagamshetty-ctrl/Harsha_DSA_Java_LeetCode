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
    public boolean isCompleteTree(TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();
        boolean flag=false;
        // if(root==null) return true;
        q.add(root);
        while(q.size()!=0){
            TreeNode curr=q.remove();
            if(curr==null) flag=true;
            else{
                if(flag==true) return false;
                q.add(curr.left);
                q.add(curr.right);
            }
        }
        return true;
    }
}