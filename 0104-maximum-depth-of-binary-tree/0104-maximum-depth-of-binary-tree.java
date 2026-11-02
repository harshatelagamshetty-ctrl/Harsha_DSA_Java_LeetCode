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
        TreeNode node;
        int level;
        Pair(TreeNode node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        List<Pair>list=new ArrayList<>();
        addLeaves(list,1,root);
        Collections.sort(list,Comparator.comparingInt(p->p.level));
        return list.get(list.size()-1).level;
    }
    public void addLeaves(List<Pair>list,int level,TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null){
            list.add(new Pair(root,level));
        }
        addLeaves(list,level+1,root.left);
        addLeaves(list,level+1,root.right);
    }
}