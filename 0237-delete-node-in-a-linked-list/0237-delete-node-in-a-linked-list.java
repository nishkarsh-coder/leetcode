/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode curr=node;
            ListNode next=node.next;
            ListNode prev=null;
        while(next!=null){
            curr.val=next.val;
            next=next.next;
            prev=curr;
            curr=curr.next;
        }
        prev.next=null;
    }
}