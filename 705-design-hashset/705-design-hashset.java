class MyHashSet {
    ListNode head;
    ListNode tail;
    public MyHashSet() {
        this.head=null;
        this.tail=null;
    }
    
    public void add(int key) {
        if(contains(key)){
            return;
        }
        if(head==null){
            head= new ListNode(key);
            tail=head;
        }
        else{
            // temp=head;
            tail.next=new ListNode(key);
            tail=tail.next;
        }
    }
    
    public void remove(int key) {
        if(contains(key)==false){
            return;
        }
        if(head.val==key){
            head=head.next;
            return;
        }
        ListNode prev=null;
        ListNode curr=head;
        
        while(curr!=null){
             if(curr.val==key){
                prev.next=curr.next;
                 if(curr.next==null){
                     tail=prev;
                 }
                 return;
            }
            prev=curr;
            curr=curr.next;
            
        }
        
        
        
       
    }
    
    public boolean contains(int key) {
        // System.out.println(key+" ");
        ListNode temp=head;
        while(temp!=null){
            // System.out.println(temp.val+"....");
            if(temp.val==key){
                return true;
            }
            temp=temp.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */