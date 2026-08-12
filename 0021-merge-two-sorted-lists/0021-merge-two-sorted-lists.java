class Solution {
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