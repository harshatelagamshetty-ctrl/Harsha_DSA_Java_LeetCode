class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head.next==null) return true;
        if(head.next.next==null){
            if(head.val!=head.next.val) return false;
            return true;
        }
        ListNode f=head;
        ListNode s=head;
        while(f!=null && f.next!=null){
            f=f.next.next;
            if(f==null) break;
            s=s.next;
        }
        ListNode sec=s.next;
        s.next=null;
        ListNode i=head;
        ListNode j=reverseList(sec);
        while(i!=null && j!=null){
            if(i.val!=j.val) return false;
            else {
                i=i.next;
                j=j.next;
            }
        }
        return true;


    }
    public ListNode reverseList(ListNode head) {
        ArrayList<ListNode> list=new ArrayList<>();
        if(head==null) return null;
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