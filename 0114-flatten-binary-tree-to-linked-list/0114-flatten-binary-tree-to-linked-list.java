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
        List<TreeNode> list=new ArrayList<>();
        bfs(root,list);
        for(int i=0;i<list.size()-1;i++){
            TreeNode first=list.get(i);
            TreeNode second=list.get(i+1);
            first.left=null;
            first.right=second;
        }
        if(list.size()==0) return;
        list.get(list.size()-1).left=null;
        list.get(list.size()-1).right=null;
    }
    public void bfs(TreeNode root,List<TreeNode> list){
        if(root==null) return;
        list.add(root);
        bfs(root.left,list);
        bfs(root.right,list);
    }
}