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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(0, preorder.length-1,0, inorder.length-1,preorder,inorder);
    }
    public TreeNode build(int preLo,int preHi,int inLo,int inHi,int[] preorder,int[] inorder){
        if(preLo>preHi) return null;
        int val=preorder[preLo];
        int r=-1;
        for(int i=inLo;i<=inHi;i++){
            if(inorder[i]==val){
                r=i;
                break;
            }
        }
        TreeNode root=new TreeNode(val);
        int count=r-inLo;
        root.left=build(preLo+1,preLo+count,inLo,r-1,preorder,inorder);
        root.right=build(count+preLo+1,preHi,r+1,inHi,preorder,inorder);
        return root;
    }
}