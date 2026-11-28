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
    static List<Integer>list;
    HashSet<Integer>set;
    public int findSecondMinimumValue(TreeNode root) {
        list=new ArrayList<>();
        set=new HashSet<>();
        dfs(root);
        for(int i:set) list.add(i);
        Collections.sort(list);
        if(list.size() < 2) return -1;
        return list.get(1);
    }
    public void dfs(TreeNode root){
        if(root==null) return;
        set.add(root.val);
        dfs(root.left);
        dfs(root.right);
    }
}