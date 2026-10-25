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
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> ans=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        dfs(ans,arr,root);
        for(int i=0;i<ans.size();i++){
            List<Integer> list=ans.get(i);
            int sum=0;
            for(int j=0;j<list.size();j++){
                sum+=list.get(j);
            }
            if(sum==targetSum) res.add(list);
        }
        return res;
    }
    
    private void dfs(List<List<Integer>> ans, List<Integer> arr, TreeNode root) {
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
            ans.add(new ArrayList<>(arr));
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.val);
        dfs(ans,arr,root.left);
        dfs(ans,arr,root.right);
        arr.remove(arr.size()-1); 
    }
}