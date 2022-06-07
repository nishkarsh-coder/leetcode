// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}

class GFG {
    	
	public static void po(Object o){
	    System.out.println(o);
	}
	
	public static void show(Node head){
        while(head != null){
            System.out.print(head.data+" ");
            head = head.next;
        }
        System.out.println();
    }
    
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    
		    Node head1 = null,tail1 = null;
		    
		    int n1 = sc.nextInt();
            int d1 = sc.nextInt();		    
		    head1 = new Node(d1);
		    tail1 = head1;
		    
		    while(n1-- > 1){
		        Node n = new Node(sc.nextInt());
		        n.next = head1;
		        head1 = n;
		    }
		    
		    Solution obj = new Solution();
		    head1 = obj.modify(head1);
		    show(head1);
		    //System.out.println();
		}
	}

}// } Driver Code Ends


/*
class Node {
    int data;
    Node next;
    
    public Node(int data){
        this.data = data;
        this.next = null;
    }
}
*/

class Solution {
    
    public static Node reverse(Node head){
        Node prev=null;
        Node temp=head;
        
        while(temp!=null){
            Node cn=temp.next;
            temp.next=prev;
            prev=temp;
            temp=cn;
        }
        return prev;
    }
    
    // Node reverseList(Node head)
    // {
    //     // code here
    //     Node prev=null;
    //     Node curr=head;
    //     System.out.println(head.data);
    //     while(curr!=null){
    //         Node next= curr.next;
    //         curr.next=prev;
    //         prev=curr;
    //         curr=next;
    //     }
    //     Node temp=prev;
    //     while(temp!=null){
    //         System.out.println(temp.data+".");
    //         temp=temp.next;
    //     }
    //     return prev;
    // }
    public Node Mid(Node head){
        Node slow=head;
        Node fast=head;
        if(fast==null){
            return head;
        }
        while(fast.next!=null&&fast.next.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
    public Node modify(Node head){
        //Write your 
        int length=0;
        // head=;
        Node mid=Mid(head);
        // System.out.println(mid.data);
        Node head1=head;
        Node head2=mid.next;
        mid.next=null;
        head2=reverse(head2);
        Node temp1=head1;
        Node temp2= head2;
        while(temp1!=null&&temp2!=null){
            // System.out.println(temp1.data+"...");
            
            temp1.data=temp1.data-temp2.data;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        // if(temp1==null){
        //     System.out.println(".3..");
        // }
        // else if(temp2==null){
        //     System.out.println("..1.");
        // }
        head2=reverse(head2);
        head=head1;
        while(head1.next!=null){
            head1=head1.next;
        }
        head1.next=head2;
        return head;
    }
}