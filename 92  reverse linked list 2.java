class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
           
     int flag=0;
        if(head==null || head.next==null){
            return head;
        }
        if(left==right){
            return head;
        }
        ListNode ptr=head;
        ListNode last=head;
        ListNode first=head;
        int i=1;
        while(i!=left){
            ptr=ptr.next;
            i++;
        }
        i=1;
        while(i!=right){
            last=last.next;
            i++;
        }
        ListNode wait=head;
        if(last.next!=null)
            wait=last.next;
        else{
             flag=1;
        }
        i=1;
        if(left!=1){
            while(i!=left-1){
                first=first.next;
                i++;
            }
            first.next=last;
        }
        else{
            head=last;
        }
        
        ListNode loc=ptr;
        while(ptr.next!=last){
        while(loc.next!=last){
            loc=loc.next;
        }
        last.next=loc;
        last=loc;
        loc=ptr;
        }
        last.next=ptr;
        if(flag==1)
            ptr.next=null;
        else
        ptr.next=wait;
     return head;   
    }
}
