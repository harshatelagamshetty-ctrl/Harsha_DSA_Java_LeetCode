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
    public void flatten(TreeNode root) {
        if(root==null) return;
        List<TreeNode>list=new ArrayList<>();
        dfs(list,root);
        for(int i=0;i<list.size()-1;i++){
            TreeNode a=list.get(i);
            a.left=null;
            a.right=list.get(i+1);
        }
        list.get(list.size()-1).left=null;
        list.get(list.size()-1).right=null;
    }
    public void dfs(List<TreeNode>list,TreeNode root){
        if(root==null) return;
        list.add(root);
        dfs(list,root.left);
        dfs(list,root.right);
    }
}