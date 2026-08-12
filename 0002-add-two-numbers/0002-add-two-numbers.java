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
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode i=l1;
        ListNode j=l2;
        int carry=0;
        while(i!=null && j!=null){
            int sum=i.val+j.val+carry;
            if(sum<=9){
                ListNode l=new ListNode(sum);
                carry=0;
                temp.next=l;
                temp=temp.next;
            }
            else{
                ListNode l=new ListNode(sum%10);
                carry=1;
                temp.next=l;
                temp=temp.next;
            }
            i=i.next;
            j=j.next;
        }
        while(i!=null){
            int sum=i.val+carry;
            if(sum<=9){
                ListNode l=new ListNode(sum);
                carry=0;
                temp.next=l;
                temp=temp.next;
            }
            else{
                ListNode l=new ListNode(sum%10);
                carry=1;
                temp.next=l;
                temp=temp.next;
            }
            i=i.next;
        }
        while(j!=null){
            int sum=j.val+carry;
            if(sum<=9){
                ListNode l=new ListNode(sum);
                carry=0;
                temp.next=l;
                temp=temp.next;
            }
            else{
                ListNode l=new ListNode(sum%10);
                carry=1;
                temp.next=l;
                temp=temp.next;
            }
            j=j.next;
        }

        if(carry==1){
            ListNode l=new ListNode(1);
            temp.next=l;
        }
        return dummy.next;
    }
}