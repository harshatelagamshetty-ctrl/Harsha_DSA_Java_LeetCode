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
        ListNode i=l1;
        ListNode j=l2;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        int carry=0;
        while(i!=null && j!=null){
            int sum=carry+i.val+j.val;
            if(sum<=9){
                carry=0;
                ListNode t=new ListNode(sum);
                temp.next=t;
                temp=temp.next;
            }
            else{
                carry=1;
                ListNode t=new ListNode(sum%10);
                temp.next=t;
                temp=temp.next;
            }
            i=i.next;
            j=j.next;
        }
            while(i!=null){
            int sum=carry+i.val;
            if(sum<=9){
                carry=0;
                ListNode t=new ListNode(sum);
                temp.next=t;
                temp=temp.next;
                i=i.next;
            }
            else{
                carry=1;
                ListNode t=new ListNode(sum%10);
                temp.next=t;
                temp=temp.next;
                i=i.next;
            }
        }
            while(j!=null){
                int sum=carry+j.val;
                if(sum<=9){
                carry=0;
                ListNode t=new ListNode(sum);
                temp.next=t;
                temp=temp.next;
                j=j.next;
            }
            else{
                carry=1;
                ListNode t=new ListNode(sum%10);
                temp.next=t;
                temp=temp.next;
                j=j.next;
            }
        }
        if(carry==1){
            ListNode t=new ListNode(1);
            temp.next=t;
        }
        return dummy.next;
        
    }
    public ListNode reverse(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }
}