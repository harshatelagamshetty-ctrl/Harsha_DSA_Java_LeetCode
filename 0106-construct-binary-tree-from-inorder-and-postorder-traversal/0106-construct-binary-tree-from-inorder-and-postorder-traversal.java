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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        int n= postorder.length;
        return build(0,n-1,0,n-1,postorder,inorder);
    }
    public TreeNode build(int postLo,int postHi,int inLo,int inHi,int[] postorder,int[] inorder){
        if(postLo>postHi) return null;
        int val=postorder[postHi];
        TreeNode root=new TreeNode(val);
        int r=-1;
        for(int i=inLo;i<=inHi;i++){
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        int count=r-inLo;
        root.left=build(postLo,postLo+count-1,inLo,r-1,postorder,inorder);
        root.right=build(postLo+count,postHi-1,r+1,inHi,postorder,inorder);
        return root;
    }
}