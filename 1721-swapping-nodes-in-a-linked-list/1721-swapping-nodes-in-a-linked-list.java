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
    ListNode first;
    public ListNode swapNodes(ListNode head, int k) {
        int floor=1;
        int var=helper(head,k,floor);
        return head;
    }
    
    public int helper(ListNode head, int k,int floor) {
        if(head==null){
            return 0;
        }
        
        if(floor==k){
        first=head;
        }
        int val=helper(head.next,k,floor+1);
        if(val+1==k){
            int a=first.val;
            first.val=head.val;
            head.val=a;
        }
        return val+1;
    }
}