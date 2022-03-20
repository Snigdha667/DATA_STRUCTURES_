import java.util.Scanner;
class Node3 {
    int data;
    Node3 next;
    public Node3(int data){
        this.data=data;
    }
}
public class CircularSinglyLinkedList {Node3 head;
    public void insertAtEnd(Node3 newnode){
        if(head==null){
            head=newnode;
            head.next=head;
        return;}
        Node3 temp=head;
        while(temp.next!=head){
            temp=temp.next;}
        temp.next=newnode;
        newnode.next=head;
        return;
    }
    public void traverse(){
        if(head==null){
            System.out.println("List is empty");
        return;}System.out.println(head.data);
        Node3 temp = head.next;
        while(temp!=head & temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }return;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CircularSinglyLinkedList cll = new CircularSinglyLinkedList();
        int val = s.nextInt();
        for (int i = 0; i < val; i++) {
            cll.insertAtEnd(new Node3(s.nextInt()));
        }cll.traverse();
    }
}