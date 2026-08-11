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
class Solution {
    public ListNode reverseList(ListNode head) {
        ArrayList<ListNode> list=new ArrayList<>();
        if(head==null) return null;
        ListNode temp=head;
        while(temp!=null){
            list.add(temp);
            temp=temp.next;
        }
        for(int i=list.size()-1;i>0;i--){
            list.get(i).next=list.get(i-1);
        }
        list.get(0).next=null;
        return list.get(list.size()-1);
    }
}