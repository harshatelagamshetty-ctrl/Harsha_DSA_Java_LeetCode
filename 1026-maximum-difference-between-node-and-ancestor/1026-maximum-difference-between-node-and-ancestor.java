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
    public int maxAncestorDiff(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        path(ans,arr,root);
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<ans.size();i++){
            List<Integer>l=ans.get(i);
            list.add(Math.abs(Collections.max(l)-Collections.min(l)));
        }
        return Collections.max(list);
    }
    public void path(List<List<Integer>>ans,List<Integer> arr,TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
            ans.add(new ArrayList<>(arr));
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.val);
        path(ans,arr,root.left);
        path(ans,arr,root.right);
        arr.remove(arr.size()-1);
    }
}