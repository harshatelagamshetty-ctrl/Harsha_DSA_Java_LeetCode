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
    static List<TreeNode>list;
    public TreeNode searchBST(TreeNode root, int val) {
        list=new ArrayList<>();
        dfs(root,val);
        if(list.isEmpty()) return null;
        return list.getFirst();
    }
    public void dfs(TreeNode root,int val){
        if(root==null) return;
        if(root.val==val) {
            list.add(root);
            return;
        }
        dfs(root.left,val);
        dfs(root.right,val);
    }
}