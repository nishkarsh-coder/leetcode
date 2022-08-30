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
    int p;
    public int getDecimalValue(ListNode head) {
        // int ans=0;
        p=0;
        return recursion(head);
        // return ans;
    }
    int recursion(ListNode temp){
        if(temp.next==null){
            int a=(int)Math.pow(2,p)*temp.val;
            p++;
            return a;
        }
        
        
        int a=recursion(temp.next);
        a+=Math.pow(2,p)*temp.val;
        p++;
        return a;
    }
}