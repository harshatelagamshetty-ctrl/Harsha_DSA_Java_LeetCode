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
    public TreeNode lcaDeepestLeaves(TreeNode root) {
        List<Pair> list=new ArrayList<>();
        addLeafPairs(root,list,0);
        Collections.sort(list,Comparator.comparingInt(p->p.level));
        int maxLevel=list.getLast().level;
        List<TreeNode>deepest=new ArrayList<>();
        for(Pair p:list){
            if(p.level==maxLevel) deepest.add(p.node);
        }
        while(deepest.size()!=1){
            TreeNode first=deepest.remove(0);
            TreeNode second=deepest.remove(0);
            TreeNode lca=lca(root, first.val, second.val);
            deepest.add(lca);
        }
        return deepest.get(0);
    }
    public TreeNode lca(TreeNode root,int x,int y){
        if(root == null) return null;
        if(root.val == x || root.val == y) return root;
        boolean leftX = isPresent(root.left, x);
        boolean leftY = isPresent(root.left, y);
        boolean rightX = isPresent(root.right, x);
        boolean rightY = isPresent(root.right, y);
        if((leftX && rightY) || (leftY && rightX)) return root;
        if(leftX && leftY) return lca(root.left, x, y);
        if(rightX && rightY)  return lca(root.right, x, y); 
        return null;
    }
    public boolean isPresent(TreeNode root,int val){
        if(root==null) return false;
        if(root.val==val) return true;
        return isPresent(root.left,val) || isPresent(root.right,val);
    }
    public void addLeafPairs(TreeNode root, List<Pair> list, int level){
        if(root==null) return;
        if(root.left==null && root.right==null){
            list.add(new Pair(root,level));
        }
        addLeafPairs(root.left,list,level+1);
        addLeafPairs(root.right,list,level+1);
    }
}