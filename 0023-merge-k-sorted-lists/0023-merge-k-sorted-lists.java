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
    public ListNode mergeKLists(ListNode[] arr) {
        if(arr.length==0) return null;
        ArrayList<ListNode> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            list.add(arr[i]);
        }
        int temp=list.size();
        while(list.size()!=1){
            ListNode l=mergeTwoLists(list.get(0),list.get(1));
            list.remove(0);
            list.remove(0);
            list.add(l);
        }
        return list.get(0);
    }
        public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        else if(list2==null) return list1;
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode i=list1;
        ListNode j=list2;
        while(i!=null && j!=null){
            if(i.val<=j.val){
                temp.next=i;
                temp=temp.next;
                i=i.next;
                if(i==null){
                    temp.next=j;
                    return dummy.next;
                }
            }
            else{
                temp.next=j;
                temp=temp.next;
                j=j.next;
                if(j==null) {
                    temp.next=i;
                    return dummy.next;
                }
            }
        }
        return dummy.next;
    }
}