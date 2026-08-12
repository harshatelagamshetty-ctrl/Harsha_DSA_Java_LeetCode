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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null) return null;
        if(head.next==null) return head;
        ListNode f=head;
        ListNode s=head;
        ListNode x=head;
        int len=0;
        while(x!=null){
            x=x.next;
            len++;
        }
        x=head;
        k=k%len;
        if(k==len) return head;
        if(k==0) return head;
        for(int i=1;i<=k;i++){
            f=f.next;
        }
        while(f.next!=null){
            f=f.next;
            s=s.next;
        }
        ListNode temp=s.next;
        s.next=null;
        f.next=x;
        return temp;
    }
}