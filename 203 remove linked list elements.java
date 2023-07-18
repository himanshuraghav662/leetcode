class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if(head==null)
        return head;
        if(head.next==null){
            if(head.val==val)
                return null;
            else
                return head;
        }
        ListNode ptr=head;
        while(ptr.val==val){
            if(ptr.next==null)
                return null;
            else
            ptr=ptr.next;
        }
        head=ptr;
        if(ptr.next==null)
            return head;
        
        ListNode loc=head.next;
        while(loc.val==val){
           if(loc.next==null){
               head.next=null;
               return head;
           }
            else
                loc=loc.next;
        }
        ptr.next=loc;
        while(loc.next!=null){
            ptr=ptr.next;
            loc=loc.next;
            while(loc.val==val){
                if(loc.next!=null)
                    loc=loc.next;
                else{
                    ptr.next=null;
                return head;
                }
                ptr.next=loc;
            }
        }
        return head;
        
    }
}
