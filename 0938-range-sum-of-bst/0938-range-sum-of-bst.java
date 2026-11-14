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
    public int rangeSumBST(TreeNode root, int low, int high) {
        List<Integer>list=new ArrayList<>();
        int sum=0;
        dfs(root,low,high,list);
        for(int i=0;i<list.size();i++) sum+=list.get(i);
        return sum;
    }
    public void dfs(TreeNode root, int low, int high,List<Integer>list){
        if(root==null) return;
        if(root.val>=low && root.val<=high) list.add(root.val);
        dfs(root.left,low,high,list);
        dfs(root.right,low,high,list);
    } 
}