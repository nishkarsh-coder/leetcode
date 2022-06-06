// { Driver Code Starts
/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;

class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}

class GFG {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-- > 0){
		    int n = sc.nextInt();
		    Node head = null, tail = null;
		    
		    char head_c = sc.next().charAt(0);
		    head = new Node(head_c);
		    tail = head;
		    
		    while(n-- > 1){
		        tail.next = new Node(sc.next().charAt(0));
		        tail = tail.next;
		    }
		    
		    Solution obj = new Solution();
		    //show(head);
		    show(obj.arrangeCV(head));
		    
		}
	}
	
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
}
// } Driver Code Ends


/*
Structure of node class is:
class Node {
    char data;
    Node next;
    
    public Node(char data){
        this.data = data;
        next = null;
    }
}
*/
class Solution {
    
    public Node arrangeCV(Node head){
        //write code here and return the head of changed linked list
        Node h_con=null;
        Node t_con=null;
        Node h_vow=null;
        Node t_vow=null;
        Node temp=head;
        while(temp!=null){
            if(temp.data=='a'||temp.data=='e'||temp.data=='i'||temp.data=='o'||temp.data=='u'){
                if(h_vow==null){
                    h_vow=temp;
                    t_vow=temp;
                }
                else{
                    t_vow.next=temp;
                    t_vow=temp;
                }
            }
            else{
                if(h_con==null){
                    h_con=temp;
                    t_con=temp;
                }
                else{
                    t_con.next=temp;
                    t_con=temp;
                }
            }
            temp=temp.next;
        }
        if(h_vow!=null&&h_con!=null){
        t_vow.next=h_con;
        t_con.next=null;
        return h_vow;
        }
        return head;
        
    }
}