/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    
    
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length==0){
            return null;
        }
        // System.out.println(lists[0]);
    ListNode head=merge(lists,0,lists.length-1); 
        return head;
    }
    
    ListNode merge(ListNode[] lists,int s,int e){
        if(s==e){
            return lists[e];
        }
        int mid=(s+e)/2;
        ListNode h1=merge(lists,s,mid);
        ListNode h2=merge(lists,mid+1,e);
        
        return merged(h1,h2);
    }
    
    ListNode merged(ListNode h1,ListNode h2){
        ListNode head=null;
        ListNode tail=null;
        if(h2==null){
            return h1;
        }
        if(h1==null){
            return h2;
        }
        while(h1!=null&&h2!=null){
            if(h1.val>h2.val){
                if(head==null){
                    head=h2;
                    tail=h2;
                }else{
                    tail.next=h2;
                    tail=h2;
                }
                h2=h2.next;
            }else{
                 if(head==null){
                    head=h1;
                    tail=h1;
                }else{
                    tail.next=h1;
                    tail=h1;
                }    
                h1=h1.next;
            }
        }
        
        while(h1!=null){
            if(head==null){
                    head=h1;
                    tail=h1;
                }else{
                    tail.next=h1;
                    tail=h1;
                }    
                h1=h1.next;
        }
        while(h2!=null){
            if(head==null){
                    head=h2;
                    tail=h2;
                }else{
                    tail.next=h2;
                    tail=h2;
                }
                h2=h2.next;
        }
        tail.next=null;
        return head;
    }
}