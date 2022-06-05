// { Driver Code Starts
// driver code

import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    
    Node(int x)
    {
        data = x;
        next = null;
    }
}

class GFG
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;
        
        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;
        
        tail.next = curr;
    }
    
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t--> 0)
        {
            int n = sc.nextInt();
            
            int num = sc.nextInt();
            Node head = new Node(num);
            Node tail = head;
            
            for(int i=0; i<n-1; i++)
            {
                num = sc.nextInt();
                tail.next = new Node(num);
                tail = tail.next;
            }
            
            int pos = sc.nextInt();
            makeLoop(head, tail, pos);
            
            Solution x = new Solution();
            System.out.println( x.countNodesinLoop(head) );
        }
    }
}
// } Driver Code Ends


/*

class Node
{
    int data;
    Node next;
    Node(int d) {data = d; next = null; }
}

*/

//Function should return the length of the loop in LL.

class Solution
{
    //Function to find the length of a loop in the linked list.
   static int countNodesinLoop(Node head)
    {
        //Add your code here.
        Node slow=head;
        Node fast=head;
        if(fast==null)
        return 0;
        while(fast!=null){
            // System.out.println("fast "+fast.data);
            if(fast==null||fast.next==null||fast.next.next==null){
            // System.out.println("::::");
                return 0;
            }
            fast=fast.next.next;
            slow=slow.next;
            if(slow==fast){
                break;
            }
        }
        slow=head;
        int len=0;
        if(slow==fast){
            if(slow.next==slow){
                return 1;
            }
            // System.out.println("fdf");
            while(fast.next!=slow){
                fast=fast.next;
                len++;
            }
            len++;
            return len; 
        }
        else{
            while(slow.next!=fast.next){
                slow=slow.next;
                fast=fast.next;
                len++;
            }
            fast.next=null;
            len++;
            slow=head;
            int size=0;
            while(slow!=null){
                slow=slow.next;
                size++;
            }
            return size-len;
        }
        // return len;
    }
}