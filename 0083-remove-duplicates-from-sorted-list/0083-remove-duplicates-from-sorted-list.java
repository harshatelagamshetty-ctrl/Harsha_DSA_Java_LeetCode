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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        ListNode i=head;
        ListNode j=i;
        t.next=i;

        while(i!=null && j!=null){
            while(i.val==j.val) {
                j=j.next;
                if(j==null){
                    t=t.next;
                    t.next=null;
                    return dummy.next;
                }
            }
            t=t.next;
            i=j;
            t.next=i;
        }
        t.next=null;
        return dummy.next;
    }
}