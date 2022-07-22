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
    public ListNode partition(ListNode head, int x) {
        // left=head;
        // solve(head,x);/
        ListNode small_head=null;
        ListNode small_tail=null;
        ListNode big_head=null;
        ListNode big_tail=null;

        ListNode temp=head;
        while(temp!=null){
            if(x>temp.val){
                if(small_head==null){
                    small_head=temp;
                    small_tail=temp;                    
                }else{
                    small_tail.next=temp;
                    small_tail=temp;
                }
            }else{
                if(big_head==null){
                    big_head=temp;
                    big_tail=temp;                    
                }else{
                    big_tail.next=temp;
                    big_tail=temp;
                }
            }
            temp=temp.next;
        }
        // small_tail.next
        
        if(small_head==null){
            return big_head;
        }else if(big_head==null){
            return small_head;
        }else{
            small_tail.next=big_head;
            big_tail.next=null;
            return small_head;
        }
        
        
    }
//     ListNode left;
//     void solve(ListNode head,int x){
//        if(head.next==null){
           
//        }
//         solve(head.next,x);
//     }
}