class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode temp=dummy;
        ListNode i=l1;
        ListNode j=l2;
        int carry=0;
        while(i!=null && j!=null){

        if(i.val+j.val+carry<=9){
            ListNode l=new ListNode(i.val+j.val+carry);
            temp.next=l;
            temp=temp.next;
            carry=0;
        }
        else{
            int sum=i.val+j.val+carry;
            ListNode l=new ListNode(sum%10);
            temp.next=l;
            temp=temp.next;
            carry=1;
        }
        i=i.next;
        j=j.next;
    }
    while(i!=null){
        int sum=i.val+carry;
        if(sum<=9){
            ListNode l=new ListNode(sum);
            temp.next=l;
            temp=temp.next;
            carry=0;
            i=i.next;
        }
        else{
            ListNode l=new ListNode(sum%10);
            temp.next=l;
            temp=temp.next;
            carry=1;
            i=i.next;
        }
    }

    while(j!=null){
        int sum=j.val+carry;
        if(sum<=9){
            ListNode l=new ListNode(sum);
            temp.next=l;
            temp=temp.next;
            carry=0;
            j=j.next;
        }
        else{
            ListNode l=new ListNode(sum%10);
            temp.next=l;
            temp=temp.next;
            carry=1;
            j=j.next;
        }
    }
    if(carry==1){
        ListNode l=new ListNode(1);
        temp.next=l;
    }
        return dummy.next;
    }
}