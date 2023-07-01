class Solution {
    public ListNode deleteMiddle(ListNode head) {
        int n=0;
        ListNode ptr=head;
        if(head==null || head.next==null){
           head=null;
            return head;
        }
        while(ptr!=null){
            n++;
            ptr=ptr.next;
        }
        ptr=head;
        if(n%2==0){
            n=n/2;
        }
        else{
            n=(n-1)/2;
        }
        for(int i=1;i<n;i++){
            ptr=ptr.next;
        }
        ptr.next=ptr.next.next;
        
        return head;
    }
}
