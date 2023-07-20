class Solution {
    public ListNode swapPairs(ListNode head) {
        if(head==null || head.next==null)
        return head;
         
         ListNode ptr=head.next;

         head.next=swapPairs(ptr.next);

         ptr.next=head;
       
        return ptr;
    }
}
