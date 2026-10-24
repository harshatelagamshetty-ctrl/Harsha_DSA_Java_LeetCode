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
    public List<Integer> rightSideView(TreeNode root) {
        int n=levels(root);
        List<Integer>list=new ArrayList<>();
        int[] arr=new int[n];
        dfs(root,arr,0);
        for(int i:arr) list.add(i);
        return list;
    }
    public void dfs(TreeNode root,int[] arr,int level){
        if(root==null) return;
        arr[level]=root.val;
        dfs(root.left,arr,level+1);
        dfs(root.right,arr,level+1);
    }
    public int levels(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(levels(root.left),levels(root.right));
    }
}