class Solution {
    public ListNode rotateRight(ListNode head, int k) {
         if(head==null || head.next==null)
         return head;
        ListNode loc=head;
        int count=1;
        while(loc.next!=null){
            loc=loc.next;
            count++;
        }
        loc.next=head;
        k=k%count;
         int w=0;
            while(w<(count-k)){
                loc=loc.next;
                w++;
            }
            head=loc.next;
            loc.next=null;

        return head;

    }
}
