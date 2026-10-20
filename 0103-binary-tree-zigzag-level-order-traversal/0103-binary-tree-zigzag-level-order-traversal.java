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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
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
        for(int i=0;i<ans.size();i++){
            if(i%2!=0){
                Collections.reverse(ans.get(i));
            }
        }
        return ans;
    }
}