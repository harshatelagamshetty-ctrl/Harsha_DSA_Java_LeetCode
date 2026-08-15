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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode f=reverseList(l1);
        ListNode s=reverseList(l2);
        ListNode i=f;
        ListNode j=s;
        ListNode dummy=new ListNode(-1);
        ListNode t=dummy;
        int carry=0;
        while(i!=null && j!=null){
            int sum=i.val+j.val+carry;
            if(sum<=9){
                ListNode l=new ListNode(sum);
                t.next=l;
                t=t.next;
                i=i.next;
                j=j.next;
                carry=0;
            }
            else{
                ListNode l=new ListNode(sum%10);
                t.next=l;
                t=t.next;
                i=i.next;
                j=j.next;
                carry=1;
            }
        }
        while(i!=null){
            int sum=i.val+carry;
            if(sum<=9){
                ListNode l=new ListNode(sum);
                t.next=l;
                t=t.next;
                i=i.next;
                carry=0;
            }
            else{
                ListNode l=new ListNode(sum%10);
                t.next=l;
                t=t.next;
                i=i.next;
                carry=1;
            }
        }
        while(j!=null){
            int sum=j.val+carry;
            if(sum<=9){
                ListNode l=new ListNode(sum);
                t.next=l;
                t=t.next;
                j=j.next;
                carry=0;
            }
            else{
                ListNode l=new ListNode(sum%10);
                t.next=l;
                t=t.next;
                j=j.next;
                carry=1;
            }
        }
        if(carry==1){
            ListNode l=new ListNode(1);
            t.next=l;
        }
        ListNode ans=reverseList(dummy.next);
        return ans;
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