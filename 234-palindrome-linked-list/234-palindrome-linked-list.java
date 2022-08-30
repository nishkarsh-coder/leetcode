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
    public boolean isPalindrome(ListNode head) {
        
        temp=head;
        return recursion(head);
    }
    ListNode temp;
    boolean recursion(ListNode head){
        if(head==null){
            return true;
        }
        boolean ans=recursion(head.next);
        if(ans==false){
            return false;
        }
        if(temp.val!=head.val){
            return false;
        }
        temp=temp.next;
        return true;
    }
}