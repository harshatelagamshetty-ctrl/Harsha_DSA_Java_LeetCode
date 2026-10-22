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
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> sol=paths(root);
        return sol;
    }
      public ArrayList<String> paths(TreeNode root) {
        ArrayList<Integer> arr=new ArrayList<>();
        ArrayList<ArrayList<Integer>> ans=new ArrayList<>();
        dfs(root,arr,ans);
        ArrayList<String> s=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            ArrayList<Integer> l=ans.get(i);
            String res="";
            for(int j=0;j<l.size();j++){
                if(j==l.size()-1) res=res+l.get(j);
                else res=res+l.get(j)+"->";
            }
            s.add(res);
        }
        return s;
    }
    public void dfs(TreeNode root,ArrayList<Integer> arr,ArrayList<ArrayList<Integer>> ans){
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
            ArrayList<Integer> list=new ArrayList<>();
            list.addAll(arr);
            ans.add(list);
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.val);
        dfs(root.left,arr,ans);
        dfs(root.right,arr,ans);
        arr.remove(arr.size()-1);  // we are actually tracking the backing part of the recursion
    }
}