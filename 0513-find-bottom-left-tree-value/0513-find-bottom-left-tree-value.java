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
            this.level=level;
            this.node=node;
        }
    }
    public int findBottomLeftValue(TreeNode root) {
        return bfs(root);
    }
    public int bfs(TreeNode root){
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root, 0));
        List<Pair>list=new ArrayList<>();
        List<List<Integer>> res=new ArrayList<>();
        while(q.size()!=0){
            Pair p=q.remove();
            TreeNode node=p.node;
            int level=p.level;
            list.add(p);
            if(node.left!=null) q.add(new Pair(node.left, level+1));
            if(node.right!=null) q.add(new Pair(node.right, level+1));
        }
        int maxLevel=list.get(list.size()-1).level;
        for(int i=0;i<=maxLevel;i++){
            res.add(new ArrayList<>());
        }
        for(Pair p:list){
            res.get(p.level).add(p.node.val);
        }
        return res.get(res.size()-1).get(0);
    }
}