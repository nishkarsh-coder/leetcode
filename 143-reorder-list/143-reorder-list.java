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
    public void reorderList(ListNode head) {
        front=head;
        size=0;
        ListNode temp=head; 
        while(temp!=null){
            size++;
            temp=temp.next;
        }
         fold(head,0);
    }
    int size;
    ListNode front;
    ListNode fold(ListNode head,int floor){
        if(head==null){
            return null;
        }
        ListNode t=fold(head.next,floor+1);
        if(floor>size/2){
            head.next=front.next;
            front.next=head;
            front=head.next;
        }
        if(size/2==floor){
            head.next=null;
        }
        return head;
    }
}