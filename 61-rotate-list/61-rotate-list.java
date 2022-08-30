class Solution {
    public ListNode rotateRight(ListNode head, int k) {
       int len=0;
        if(head==null||k==0||head.next==null){
            return head;
        }
        ListNode temp=head;
        while(temp!=null){
            len++; 
            temp=temp.next;
       } 
        
        if(len<=k){
            k=k%len;
        }
        // System.out.println(k+" "+len);
        if(k==0){
            return head;
        }
        ListNode slow=null;
        ListNode fast=head;
        // Node slow=head;
        int n=len-k;
        while(n>0){
            slow=fast;
            fast=fast.next;
            n--;
        }
        slow.next=null;
        if(fast==null){
            return head;
        }else{
            slow=fast;
            while(slow.next!=null){
                slow=slow.next;
            }
            slow.next=head;
            
            return fast;
        }
        
    }
    
    // Node reverse(Node head){
    //     Node prev=null;
    //     Node curr=head;
    //     while(curr!=null){
    //         Node temp=curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=temp;
    //     }
    //     return prev;
    // }
}