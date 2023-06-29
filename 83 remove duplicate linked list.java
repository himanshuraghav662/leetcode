class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode ptr=head;
       
        if(head==null || head.next==null)
            return head;
         ListNode loc=head.next;
        while(head.next.next!=null){
            if(loc.val==head.val){
                head.next=loc.next;
                loc.next=null;
                loc=head.next;
            }
            else{
                head=head.next;
                loc=loc.next;
            }
        } 
        if(loc.val==head.val){
            head.next=null;
            head=ptr;
        }
        else
            head=ptr;
        
        return head;   
    }
}
