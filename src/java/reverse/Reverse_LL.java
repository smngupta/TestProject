/**
 The classes are for demonstarting reverse list example.
 @author Suman Gupta
*/
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
 
class Reverse_LL{
    static Node head;
    public Node reverse(Node head){
        Node p;
        Node q;
        if(head==null)
        return null;
        p=head;
        q=p.next;
        if(q==null)
        return p;
        q=reverse(q);
        p.next.next=p;
        p.next=null;
        return q;
    }
    void print(Node head){
        while(head!=null){
            System.out.print(head.data+" ");
            head=head.next;
        }
    }
    public void push(int n){
        Node new_node=new Node(n);
        new_node.next=head;
        head=new_node;   
    }
    
    public static void main(String[]args){
        Reverse_LL r=new Reverse_LL();
        r.push(1);
        r.push(2);
        r.push(3);
        r.push(4);
        System.out.println("Reverse Linked List is");
        r.reverse(head);
        
    }
    
}
