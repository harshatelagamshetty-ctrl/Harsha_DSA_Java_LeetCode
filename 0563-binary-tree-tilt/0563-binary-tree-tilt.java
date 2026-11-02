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
    public int findTilt(TreeNode root) {
        List<Integer>list=new ArrayList<>();
        int h=treeSum(root,list);
        int sum=0;
        for(int i=0;i<list.size();i++) sum+=list.get(i);
        return sum;
    }
    public int treeSum(TreeNode root,List<Integer>list){
        if(root==null) return 0;
        int leftSum=treeSum(root.left,list);
        int rightSum=treeSum(root.right,list);
        list.add(Math.abs(leftSum-rightSum));
        return root.val+leftSum+rightSum;
    }
}