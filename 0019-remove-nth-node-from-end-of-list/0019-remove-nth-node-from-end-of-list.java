class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next==null) return null;
        if(n==1){
            ListNode temp=head;
            while(temp.next.next!=null) temp=temp.next;
            temp.next=null;
            return head;
        }
        ListNode f=head;
        ListNode s=head;
        for(int i=1;i<=n;i++) f=f.next;
        while(f!=null){
            f=f.next;
            s=s.next;
        }
        s.val=s.next.val;
        s.next=s.next.next;
        return head;
    }
}