class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow=head;
        ListNode fast=head;
       if(head.next==null)
       return head;
       if(head.next!=null && head.next.next==null)
       return head.next;
        while(slow.next!=null){
        slow=slow.next;
        fast=fast.next.next;
        if(fast.next==null)
        return slow;
        else if(fast.next.next==null)
        return slow.next;
        }
        return head;
    }
}
