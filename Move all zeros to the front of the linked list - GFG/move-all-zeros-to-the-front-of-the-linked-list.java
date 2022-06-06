// { Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Zeroes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Node head=null;
            Node curr=null;
            while(n-->0){
                int a=sc.nextInt();
                if(head==null){
                    head=new Node(a);
                    curr=head;
                }
                else{
                    Node temp=new Node(a);
                    temp.next=null;
                    curr.next=temp;
                    curr=temp;
                }
            }
            GfG g=new GfG();
            head = g.moveZeroes(head);
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
            System.out.println();
        }
    }
}

// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/

class GfG{
    public Node moveZeroes(Node head){
        //Your Code here.
        Node h_zero=null;
        Node t_zero=null;
        Node h_non=null;
        Node t_non=null;
        Node temp=head;
        while(temp!=null){
            if(temp.data==0){
                if(h_zero==null){
                    h_zero=temp;
                    t_zero=temp;
                }
                else{
                    t_zero.next=temp;
                    t_zero=temp;
                }
            }
            else{
                if(h_non==null){
                    h_non=temp;
                    t_non=temp;
                }
                else{
                    t_non.next=temp;
                    t_non=temp;
                }
            }
        temp=temp.next;    
        }
        if(h_zero!=null&&h_non!=null){
            t_zero.next=h_non;
            t_non.next=null;
            return h_zero;
        }
        return head;
    }
}