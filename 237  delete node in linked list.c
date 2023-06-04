void deleteNode(struct ListNode* node) {
    struct ListNode* ptr;
    ptr=node;
    while(ptr->next!=NULL){
        if(ptr->next->next==NULL){
          ptr->val=ptr->next->val;
          ptr->next=NULL;  
        }
        else{
        ptr->val=ptr->next->val;
        ptr=ptr->next;
        }
       
    }
    
    
    

}
