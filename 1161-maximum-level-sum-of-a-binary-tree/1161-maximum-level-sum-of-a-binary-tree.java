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

    public int maxLevelSum(TreeNode root) {
        return bfs(root);
    }    
    public int bfs(TreeNode root){
        int max=Integer.MIN_VALUE;
        int maxLevel=0;
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
        int MaxLevel=list.get(list.size()-1).level;
        for(int i=0;i<=MaxLevel;i++){
            res.add(new ArrayList<>());
        }
        for(Pair p:list){
            res.get(p.level).add(p.node.val);
        }
        for(int i=0;i<res.size();i++){
            int sum=0;
            List<Integer>l=res.get(i);
            for(int j=0;j<l.size();j++) sum+=l.get(j);
            if(sum>max){
                max=sum;
                maxLevel=i+1;
            }
        }
        return maxLevel;
    }
}