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
    public List<Integer> rightSideView(TreeNode root) {
        List<List<Integer>> list=levelOrder(root);
        List<Integer> res=new ArrayList<>();
        for(int i=0;i<list.size();i++){
            res.add(list.get(i).get(list.get(i).size()-1));
        }
        return res;
    }
    public static class Pair{
        TreeNode node;
        int level;
        Pair(TreeNode node,int level){
            this.node=node;
            this.level=level;
        }
    }
    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<Pair> q=new LinkedList<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<Pair>list=new ArrayList<>();
        if(root==null) return ans;
        q.add(new Pair(root,0));
        while(q.size()!=0){
            Pair p=q.remove();
            TreeNode node=p.node;
            int level=p.level;
            list.add(p);
            if(node.left!=null) q.add(new Pair(node.left,level+1));
            if(node.right!=null) q.add(new Pair(node.right,level+1));
        }
        
        int maxLevel=list.get(list.size()-1).level;
        for(int i=0;i<=maxLevel;i++){
            ans.add(new ArrayList<>());
        }
        for(Pair p:list){
            ans.get(p.level).add(p.node.val);
        }
        return ans;
    }
}