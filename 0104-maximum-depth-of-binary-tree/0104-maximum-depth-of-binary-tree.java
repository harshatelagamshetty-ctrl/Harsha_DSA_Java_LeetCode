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
    static class Pair{
        int level;
        TreeNode node;
        public Pair(TreeNode node,int level){
            this.node =node;
            this.level=level;
        }
    }
    public int maxDepth(TreeNode root){
        if(root==null) return 0;
        List<Pair> list=new ArrayList<>();
        dfs(list,root,1);
        Collections.sort(list,Comparator.comparingInt(p->p.level));
        return list.get(list.size()-1).level;
    }

    private void dfs(List<Pair> list, TreeNode root,int level) {
        if(root==null) return;
        if(root.left==null && root.right==null){
            list.add(new Pair(root,level));
        }
        dfs(list,root.left,level+1);
        dfs(list,root.right,level+1);
    }
}