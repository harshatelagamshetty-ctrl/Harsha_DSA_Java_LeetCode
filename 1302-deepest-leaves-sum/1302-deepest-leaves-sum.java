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
        public Pair(TreeNode node, int level){
            this.node = node;
            this.level = level;
        }
    }
    public int deepestLeavesSum(TreeNode root) {
        List<Pair> list=new ArrayList<>();
        addLeafPairs(root,list,1);
        int h=height(root);
        int sum=0;
        for(int i=0;i<list.size();i++){
            if(list.get(i).level==h) sum+=list.get(i).node.val;
        }
        return sum;
    }
    public void addLeafPairs(TreeNode root, List<Pair> list,int level){
        if(root==null) return;
        if(root.left==null && root.right==null){
            list.add(new Pair(root,level));
        }
        addLeafPairs(root.left,list,level+1);
        addLeafPairs(root.right,list,level+1);
    }
    public static int height(TreeNode root){
        if(root==null) return 0;
        int leftTree=height(root.left);
        int rightTree=height(root.right);
        return 1+Math.max(leftTree,rightTree);
    }
}