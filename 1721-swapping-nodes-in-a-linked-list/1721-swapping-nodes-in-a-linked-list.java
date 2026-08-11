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
    public ListNode swapNodes(ListNode head, int k) {
        ListNode temp=head;
        for(int i=1;i<=k-1;i++){
            temp=temp.next;
        }
        ListNode first=temp;
        temp=head;
        for(int i=1;i<=k;i++) temp=temp.next;
        ListNode s=head;
        while(temp!=null){
            temp=temp.next;
            s=s.next;
        }
        int x=first.val;
        first.val=s.val;
        s.val=x;
        return head;    
    }
}