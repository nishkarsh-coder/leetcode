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
    public ListNode addTwoNumbers(ListNode r1, ListNode r2) {
        // System.out.println(l1.val);
        ListNode ans=null;
        // ListNode r1= reverse(l1);
        // ListNode r2=reverse(l2);
        ListNode tail=ans;
        ListNode a=new ListNode();
        // System.out.println(a.val+" "+a.next);
        int div=0;
        while(r1!=null&&r2!=null){
           ListNode temp=new ListNode();
            int r= (r1.val+r2.val+div)%10;;
            temp.val= r;
            div= (r1.val+r2.val+div)/10;            
            // temp.next=null;
            if(ans==null){
                tail=temp;
                ans=temp;
            }else{
                tail.next=temp;
                tail=temp;
            }
            r1=r1.next;
            r2=r2.next;
        }
        while(r2!=null){
         ListNode temp=new ListNode();
            int r= (r2.val+div)%10;;
            temp.val= r;
            div= (r2.val+div)/10;   
            // System.out.println(div+"."+r2.next);
            temp.next=null;
           // div=r2.val/10;
           if(ans==null){
                tail=temp;
                ans=temp;
            }else{
                tail.next=temp;
                tail=temp;
            } 
            r2=r2.next;
        }
        while(r1!=null){
             ListNode temp=new ListNode();
           int r= (r1.val+div)%10;;
            temp.val= r;
            div= (r1.val+div)/10;  
                        temp.next=null;
           if(ans==null){
                tail=temp;
                ans=temp;
            }else{
                tail.next=temp;
                tail=temp;
            } 
            r1=r1.next;
        }
        System.out.println(div);
        if(div!=0){
            ListNode temp=new ListNode();
            temp.val=div;
            temp.next=null;

            tail.next=temp;
            tail=temp;

        }
        return ans;
    }
    // int[] size=new size[2];
    // public ListNode reverse(ListNode l){
    //     ListNode prev=null;
    //     ListNode curr=l;
    //     while(curr!=null){
    //     ListNode temp=curr.next; 
    //     curr.next=prev;
    //     prev=curr;
    //     curr=temp;
    //     // size++;/
    //     }
    //     return prev;
    // }
}