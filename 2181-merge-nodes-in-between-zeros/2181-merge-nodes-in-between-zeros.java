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
    public ListNode mergeNodes(ListNode head) {
        ListNode i=head;
        ListNode j=head.next;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        int sum=0;
        while(j!=null){
            if(j.val!=0){
                sum=sum+j.val;
                j=j.next;
            }
            else{
                i=j;
                ListNode l=new ListNode(sum);
                t.next=l;
                t=t.next;
                j=i.next;
                sum=0;
            }
        }
        t.next=null;
        return dummy.next;
    }
}