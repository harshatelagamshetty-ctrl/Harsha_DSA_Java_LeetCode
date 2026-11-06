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
        int idx;

        public Pair(TreeNode node, int idx) {
            this.node = node;
            this.idx = idx;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        bfs(list,root,0);
        return Collections.max(list);
    }
    public static void bfs(List<Integer>list,TreeNode root,int idx){
        Queue<Pair>q=new LinkedList<>();
        q.add(new Pair(root,0));
        while(!q.isEmpty()){
            int firstIdx=q.peek().idx;
            int lastIdx = 0;
            for (Pair p : q) {
                lastIdx = p.idx;
            }
            list.add(lastIdx-firstIdx+1);
            int size=q.size();
            for(int i=1;i<=size;i++){
                Pair p=q.remove();
                if(p.node.left!=null) q.add(new Pair(p.node.left,2*(p.idx)+1));
                if(p.node.right!=null) q.add(new Pair(p.node.right,2*(p.idx)+2));
            }
        }
    }
}