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
        int val;
        int level;

        public Pair(int val, int level) {
            this.val = val;
            this.level = level;
        }
    }
    public int deepestLeavesSum(TreeNode root) {
        List<Pair>list=new ArrayList<>();
        collectLeaves(root,list,0);
        Collections.sort(list,Comparator.comparingInt(p->p.level));
        int lastLevel=list.getLast().level;
        int sum=0;
        for(Pair p:list){
            if(p.level==lastLevel) sum+=p.val;
        }
        return sum;
    }
    private static void collectLeaves(TreeNode root, List<Pair> list, int level) {
        if(root==null) return;
        if(root.left==null && root.right==null){
            list.add(new Pair(root.val,level));
        }
        collectLeaves(root.left,list,level+1);
        collectLeaves(root.right,list,level+1);
    }
}