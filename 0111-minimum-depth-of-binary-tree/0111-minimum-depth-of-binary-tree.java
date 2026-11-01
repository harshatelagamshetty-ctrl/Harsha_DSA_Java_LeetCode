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
    // back tracking
    public int minDepth(TreeNode root) {
        if(root==null) return 0;
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        dfs(arr,ans,root);
        int min=Integer.MAX_VALUE;
        for(int i=0;i<ans.size();i++){
            List<Integer> l=ans.get(i);
            min=Math.min(min,l.size());
        }
        return min;
    }
    public void dfs(List<Integer> arr,List<List<Integer>> ans,TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
            ans.add(new ArrayList<>(arr));
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.val);
        dfs(arr,ans,root.left);
        dfs(arr,ans,root.right);
        arr.remove(arr.size()-1); //back tracking
    }
}