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
    ListNode reverse(ListNode head,int n)
    {   
        ListNode tail=head;
        ListNode prev=null;
        ListNode curr=head;
        int k=0;
        while(k<n){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
            k++;
        }
        tail.next=curr;
        return prev;
        
    }    public ListNode reverseKGroup(ListNode head, int k) {
        int n=0;
        ListNode temp=head;
        while(temp!=null){
            n++;
            temp=temp.next;
        }
        ListNode t=head;
        if(n>=k){
            head=reverse(head,k);
            n=n-k;
        }
        ListNode h= t.next;
        while(n>=k){
            temp=h;
             h=reverse(h,k);
            t.next=h;
            t=temp;
            h=temp.next;
            n=n-k;
        }
        return head;
    }
}