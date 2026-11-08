/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {
        List<Integer>ans=new ArrayList<>();
        List<TreeNode>list=new ArrayList<>();
        collect(root,list);
        for(int i=0;i<list.size();i++){
            //Distance(a,b)=Level(a)+Level(b)-2*Level(LCA)
            TreeNode a=list.get(i);
            TreeNode lca=lca(root,a.val,target.val);
            TreeNode b=target;
            int dist=level(root,a.val)+level(root,b.val)-2*level(root,lca.val);
            if(dist==k) ans.add(a.val);
        }
        return ans;
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
    public int level(TreeNode root,int val){
        return dfs(root,val,0);
    }
    public int dfs(TreeNode root,int val,int level){
        if(root==null) return -1;
        if(root.val==val) return level;
        int left=dfs(root.left,val,level+1);
        if(left!=-1) return left;
        return dfs(root.right,val,level+1);
    }
    public void collect(TreeNode root,List<TreeNode>list){
        if(root==null) return;
        list.add(root);
        collect(root.left,list);
        collect(root.right,list);
    }
}