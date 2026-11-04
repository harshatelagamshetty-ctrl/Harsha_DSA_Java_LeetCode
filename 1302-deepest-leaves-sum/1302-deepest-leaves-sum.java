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
    public static class Pair{
        int level;
        TreeNode node;
        Pair(TreeNode node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public int deepestLeavesSum(TreeNode root) {
        int h=height(root);
        List<Pair>list=new ArrayList<>();
        leafLevel(root,0,list);
        int sum=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).level+1==h) sum+=list.get(i).node.val;
        }
        return sum;

    }
    public int height(TreeNode root){
        if(root==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public void leafLevel(TreeNode root,int level,List<Pair>list){
        if(root==null) return;
        if(root.left==null && root.right==null){
            list.add(new Pair(root,level));
        }
        leafLevel(root.left,level+1,list);
        leafLevel(root.right,level+1,list);
    }
}