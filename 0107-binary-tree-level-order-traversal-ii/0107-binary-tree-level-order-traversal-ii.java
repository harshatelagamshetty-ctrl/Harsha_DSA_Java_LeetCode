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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<Pair>q=new LinkedList<>();
        List<Pair>list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null) return ans;
        q.add(new Pair(root,0));
        while(q.size()!=0){
            Pair p=q.remove();
            list.add(p);
            if(p.node.left!=null) q.add(new Pair(p.node.left,p.level+1));
            if(p.node.right!=null) q.add(new Pair(p.node.right,p.level+1));
        }
        int max=list.get(list.size()-1).level;
        for(int i=0;i<=max;i++){
            ans.add(new ArrayList<>());
        }
        for(Pair p:list){
            ans.get(p.level).add(p.node.val);
        }
        Collections.reverse(ans);
        return ans;
    }
}