package BINARY_SEARCH_TREES;

import java.util.ArrayList;
import java.util.*;

public class BstToGst {
    public TreeNode bstToGst(TreeNode root) {
        List<TreeNode> list=new ArrayList<>();
        List<Integer> inorder=new ArrayList<>();
        inorder(root,inorder);
        collect(root,list);
        for(int i=0;i<list.size();i++){
            TreeNode node=list.get(i);
            node.val=greaterSum(node.val,inorder);
        }
        return root;
    }
    public void inorder(TreeNode root,List<Integer>inorder){
        if(root==null) return;
        inorder(root.left,inorder);
        inorder.add(root.val);
        inorder(root.right,inorder);
    }
    public void collect(TreeNode root,List<TreeNode> list){
        if(root==null) return;
        list.add(root);
        collect(root.left,list);
        collect(root.right,list);
    }
    public int greaterSum(int val,List<Integer>list){
        int sum=0;
        int idx= list.indexOf(val);
        for(int i=idx;i<list.size();i++) sum+=list.get(i);
        return sum;
    }
}
