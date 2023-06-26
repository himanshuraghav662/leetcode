public class Solution {
    public boolean hasCycle(ListNode head) {
      boolean a=false;
      ListNode ptr=head;
      ListNode loc=head;
      int q=0;
      if(ptr==null || ptr.next==null){
          return false;
      }
      else{
      while(ptr.next.next!=null){
          ptr=ptr.next.next;
          if(q>0){
              if(ptr==loc){
                  return true;
              }
          }
          if(ptr.next==null || ptr.next.next==null){
              return false;
          }
          else{
              loc=loc.next;
              q++;

          }
          if(q>0){
              if(ptr==loc){
                  return true;
              }
          }

      }
      }
      return a;
    }
}
