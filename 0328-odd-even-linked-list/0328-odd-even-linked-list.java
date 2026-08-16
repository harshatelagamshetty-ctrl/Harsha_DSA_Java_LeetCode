class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        // Loop until we reach the end of the even list
        while (even != null && even.next != null) {
            odd.next = even.next;    // Connect odd node to next odd node
            odd = odd.next;          // Move odd pointer forward
            
            even.next = odd.next;    // Connect even node to next even node
            even = even.next;        // Move even pointer forward
        }

        // Connect the end of odd list to the start of even list
        odd.next = evenHead;

        return head;
    }
}