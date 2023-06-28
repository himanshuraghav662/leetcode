  ListNode ptr=head;
         ListNode loc=head;
          ListNode last=head;
          if(head==null || head.next==null){
              return head;
          }

        while(head.next != null){
            head=head.next;
        }
        while(last.next!=head){
            last=last.next;
        }
        head.next=last;
        while(ptr.next!=last){
        while(loc.next!=last){
            loc=loc.next;
        }
        last.next=loc;
        last=loc;
        loc=ptr;
        }
        last.next=ptr;
        ptr.next=null;
       return head;
