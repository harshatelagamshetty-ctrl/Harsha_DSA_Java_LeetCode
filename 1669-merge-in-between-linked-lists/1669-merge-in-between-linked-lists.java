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
    public ListNode mergeInBetween(ListNode list1, int x, int b, ListNode list2) {
        ListNode i=list1;
        for(int a=1;a<=x-1;a++){
            i=i.next; 
        }
        ListNode f=i;
        i=list1;
        for(int a=1;a<=b;a++){
            i=i.next;
        }
        ListNode s=i.next;
        i=list1;
        while(i!=f){
            i=i.next;
        }
        i.next=list2;
        ListNode j=list1;
        while(j.next!=null) j=j.next;
        j.next=s;
        return list1;
    }
}