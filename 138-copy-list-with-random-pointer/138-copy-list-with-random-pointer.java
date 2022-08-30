/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
    public Node copyRandomList(Node head) {
        Node h=head;
        if(head==null){
            return null;
        }
        
        while(head!=null){
            Node copy=new Node(head.val);
            Node temp=head.next;
            head.next=copy;
            copy.next=temp;
            head=head.next.next;
        }
        head=h;
        while(head!=null){
            if(head.random==null){
                head.next.random=head.random;
            }else{
            head.next.random=head.random.next;                
            }
            head=head.next.next;
        }
        head=h.next;
        Node temp=head;
        Node dummy=h;
        while(temp.next!=null){
            // Node t=temp.next.next;
            dummy.next=temp.next;
            dummy=dummy.next;
            temp.next=temp.next.next;
            temp=temp.next;
        }
        dummy.next=temp.next;
        return head;
    }
}