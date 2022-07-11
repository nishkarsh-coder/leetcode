// { Driver Code Starts
import java.util.*;
import java.lang.*;

class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}

class Rearr
{
    static Node head;
    
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int t  =sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            int a1 = sc.nextInt();
            Node head = new Node(a1);
            Node temp = head;
            for(int i = 1; i < n; i++)
            {
                int a = sc.nextInt();
                temp.next = new Node(a);
                temp = temp.next;
            }
            
            Solution ob = new Solution();
            ob.rearrange(head);
            printLast(head);
            System.out.println();
        }
    }
    
    public static void printLast(Node node)
    {
        while(node != null)
        {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
}// } Driver Code Ends


/*node class of the linked list
class Node
{
    int data;
    Node next;
    Node(int key)
    {
        data = key;
        next = null;
    }
}*/
class Solution
{
    public static void rearrange(Node head)
    {
        // add your code 
        if(head==null){
            return;
        }
        Node even_head=head;
        Node odd_tail=head.next;
        Node even_tail=head;
        Node odd_head=head.next;
        
        while(odd_head!=null&&even_tail!=null&&odd_head.next!=null&&even_tail.next!=null){
            even_tail.next=even_tail.next.next;
            even_tail=even_tail.next;
            odd_head.next=odd_head.next.next;
            if(odd_head.next!=null){
            odd_head=odd_head.next;
            }
        }
        if(odd_head!=null){
        odd_head.next=null;
        }
        reverse(odd_tail);
        even_tail.next=odd_head;
        // while(odd_head!=null){
        //     System.out.println(odd_head.data);
        //     odd_head=odd_head.next;
        // }
       
    }
    static void reverse(Node node){
        Node prev=null;
        Node curr=node;
        while(curr!=null){
            Node next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
    }
}
