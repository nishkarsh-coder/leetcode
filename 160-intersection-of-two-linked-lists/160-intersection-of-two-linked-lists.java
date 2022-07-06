/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=0;
        ListNode temp=headA;
        while(temp!=null){
            temp=temp.next;
            size1++;
        }
       temp=headB;
        int size2=0;
        while(temp!=null){
            temp=temp.next;
            size2++;
        }        
            ListNode temp1=headA;
            ListNode temp2=headB;

        if(size2<size1){
            int k=size1-size2;
            while(k>0){
            temp1=temp1.next;
                k--;
            }
        }else{
            int k=size2-size1;
            while(k>0){
            temp2=temp2.next;
                k--;
            }
        }
        System.out.println(temp2.val);
        while(temp1!=null&&temp2!=null){
            if(temp1==temp2){
                return temp1;
            }
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return null;
        
    }
    
    
}