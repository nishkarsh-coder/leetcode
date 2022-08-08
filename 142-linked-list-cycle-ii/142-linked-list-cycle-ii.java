/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
       HashSet<ListNode> s=new HashSet<>();
        // int idx=0;
       while(head!=null){
           // System.out.println(head.val);
           if(s.contains(head)){
               // System.out.println(s+" "+head+" "+s.get(head));
               return head;
           }
           s.add(head);
           head=head.next;   
           // idx++;
       } 
        
        return head;
    }
}