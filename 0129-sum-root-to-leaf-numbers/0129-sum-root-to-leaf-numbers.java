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
// class Solution {
//     public int sumNumbers(TreeNode root) {
//         List<List<Integer>> ans=new ArrayList<>();
//         List<Integer> arr=new ArrayList<>();
//         bfs(ans,arr,root);
//         int sum=0;
//         for(int i=0;i<ans.size();i++){
//             StringBuilder sb=new StringBuilder();
//             List<Integer>l=ans.get(i);
//             for(int j=0;j<l.size();j++) sb.append(l.get(j));
//             sum+=Integer.parseInt(sb.toString());
//         }
//         return sum;
//     }
//     private void bfs(List<List<Integer>> ans, List<Integer> arr, TreeNode root) {
//         if(root==null) return;
//         if(root.left==null && root.right==null){
//             arr.add(root.val);
//             ans.add(new ArrayList<>(arr));
//             arr.remove(arr.size()-1);
//             return;
//         }
//         arr.add(root.val);
//         bfs(ans,arr,root.left);
//         bfs(ans,arr,root.right);
//         arr.remove(arr.size()-1);
//     }
// }
class Solution {
    public int sumNumbers(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer>arr=new ArrayList<>();
        dfs(ans,arr,root);
        int sum=0;
        for(int i=0;i<ans.size();i++){
            List<Integer>l=ans.get(i);
            StringBuilder sb=new StringBuilder();
            for(int j=0;j<l.size();j++) sb.append(l.get(j));
            sum+=Integer.parseInt(sb.toString());
        }
        return sum;
    }
    public void dfs(List<List<Integer>> ans,List<Integer>arr,TreeNode root){
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
            ans.add(new ArrayList<>(arr));
            arr.removeLast();
            return;
        }
        arr.add(root.val);
        dfs(ans,arr,root.left);
        dfs(ans,arr,root.right);
        arr.removeLast();
    }
}