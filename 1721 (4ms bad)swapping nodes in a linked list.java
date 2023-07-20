class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        if(head==null || head.next==null)
        return head;
        int count=1;
        ListNode loc=head;
        ListNode ptr=head;
        while(ptr.next!=null){
            if(ptr.next.next!=null)
            loc=loc.next;
            ptr=ptr.next;
            count++;
        }
       
        if((k==1 || k==count) && count>2){
            ptr.next=head.next;
            head.next=null;
            loc.next=head;
            return ptr;
        }
        if(count==2 && (k==2 || k==1)){
            ptr.next=head;
            head.next=null;
            return ptr;
        }
        ptr=head;
        if(count%2!=0 && count+1/2==k)
        return head;
        if(count%2==0 && (count/2)+1==k){
            k=k+1-1;
        }
        else if((count/2)<=k)
        k=count+1-k;
        

        int i=1;
        while(i!=k-1){
            ptr=ptr.next;
            i++;
        }
        ListNode pt=ptr.next;
       loc=head;
        i=1;
        while(i!=count-k){
            loc=loc.next;
            i++;
        }
        ListNode lo=loc.next;
        ptr.next=lo;
        ListNode a=pt.next;
        pt.next=lo.next;
        lo.next=a;
        loc.next=pt;
        

        return head;
    }
}
