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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        // testing the case where all the elements are same
        HashSet<Integer> set = new HashSet<>();
        ListNode harsha=head;
        while(harsha!=null){
            set.add(harsha.val);
            harsha=harsha.next;
        }
        if(set.size()==1 && set.contains(val)) return null;
        ListNode t=head;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode i=head;
        while(i!=null){
            if(i.val==val){
                i=i.next;
            }
            else{
                temp.next=i;
                temp=temp.next;
                i=i.next;
            }
        }
        temp.next=null;
        return dummy.next;
    }
}