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

    public String smallestFromLeaf(TreeNode root) {
        List<String> list=new ArrayList<>();
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        bfs(ans,arr,root);
        for(int i=0;i<ans.size();i++){
            List<Integer>l=ans.get(i);
            StringBuilder sb=new StringBuilder();
            for(int j=l.size()-1;j>=0;j--){
                char ch=(char)(l.get(j)+'a');
                sb.append(ch);
            }
            list.add(sb.toString());
        }    
        Collections.sort(list);
        return list.get(0);
    }
    private void bfs(List<List<Integer>> ans, List<Integer> arr, TreeNode root) {
        if(root==null) return;
        if(root.left==null && root.right==null){
            arr.add(root.val);
            ans.add(new ArrayList<>(arr));
            arr.remove(arr.size()-1);
            return;
        }
        arr.add(root.val);
        bfs(ans,arr,root.left);
        bfs(ans,arr,root.right);
        arr.remove(arr.size()-1);
    }
}