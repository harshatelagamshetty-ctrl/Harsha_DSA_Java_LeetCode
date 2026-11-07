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
    public TreeNode lcaDeepestLeaves(TreeNode root){
        List<Pair>list=new ArrayList<>();
        collectLeaves(list,root,0);
        Collections.sort(list, Comparator.comparingInt(p->p.level));
        int maxLevel=list.getLast().level;
        List<TreeNode>deepest=new ArrayList<>();
        for(Pair p:list){
            if(p.level==maxLevel) deepest.add(p.node);
        }
        while(deepest.size()!=1){
            TreeNode first=deepest.remove(0);
            TreeNode second=deepest.remove(0);
            TreeNode lca=lca(root,first.val, second.val);
            deepest.add(lca);
        }
        return deepest.getFirst();
    }

    private void collectLeaves(List<Pair> list, TreeNode root,int level) {
        if(root==null) return;
        if(root.left==null && root.right==null){
            list.add(new Pair(root,level));
        }
        collectLeaves(list,root.left,level+1);
        collectLeaves(list,root.right,level+1);
    }
    public boolean isPresent(TreeNode root,int val){
        if(root==null) return false;
        if(root.val==val) return true;
        return isPresent(root.left,val) || isPresent(root.right,val);
    }
    public TreeNode lca(TreeNode root,int x,int y){
        if(root==null) return null;
        if(root.val==x || root.val==y) return root;
        boolean XonLeft=isPresent(root.left,x);
        boolean XonRight=isPresent(root.right,x);
        boolean YonLeft=isPresent(root.left,y);
        boolean YonRight=isPresent(root.right,y);

        if(XonLeft && YonRight) return root;
        if(XonRight && YonLeft) return root;
        if(XonLeft && YonLeft) return lca(root.left,x,y);
        if(XonRight && YonRight) return lca(root.right,x,y);
        return null;
    }
}