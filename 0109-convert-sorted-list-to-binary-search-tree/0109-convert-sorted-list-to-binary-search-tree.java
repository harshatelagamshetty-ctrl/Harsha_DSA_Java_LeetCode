/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode sortedListToBST(ListNode head) {
    List<Integer> arr = new ArrayList<>();
    ListNode temp = head;
    while (temp != null) {
        arr.add(temp.val);
        temp = temp.next;
    }
    return sortedArrayToBST(arr);
}
    public TreeNode sortedArrayToBST(List<Integer> arr) {
        int n=arr.size();
        return convert(arr,0,n-1);
    }
    public TreeNode convert(List<Integer> arr,int i,int j){
        if(i>j) return null;
        int mid=(i+j)/2;
        TreeNode root=new TreeNode(arr.get(mid));
        root.left=convert(arr,i,mid-1);
        root.right=convert(arr,mid+1,j);
        return root;
    }
}