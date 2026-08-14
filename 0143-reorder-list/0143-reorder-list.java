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
    public void reorderList(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            s=s.next;
        }
        ListNode fir=head;
        ListNode x=s.next;
        s.next=null;
        ListNode sec=reverseList(x);
        ListNode i=fir;
        ListNode j=sec;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        while(i!=null && j!=null){
            temp.next=i;
            temp=temp.next;
            i=i.next;
            if(i==null){
                temp.next=j;
            }
            temp.next=j;
            temp=temp.next;
            j=j.next;
            if(j==null){
                temp.next=i;
            }
        }

    }
        public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        ArrayList<ListNode> list=new ArrayList<>();
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