package MenuDriven;
import java.util.Scanner;
class Node{
    Node next;
    Node previous;
    String data;
    Node(String data){
        this.data=data;
    }
}
public class DoublyLinkedList {
    Node head;
    Node tail;
    Node temp;
    public void InsertAtEnd(Node newnode) {
        if (head == null) {
            head = newnode;
            return;
        }
        temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newnode;
        tail = temp.next;
        newnode.previous = temp;
        return;
    }
    public void InsertAtBeginn(Node newnode) {
        if (head == null) {
            head = newnode;
            return;
        }
        head.previous = newnode;
        newnode.next=head;
        head=head.previous;
        temp = head;
        while (temp!=null & temp.next==null)
            tail=temp;
        return;
    }
    public void DeleteFromBeginn() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.previous = null;
        System.out.println("Val Deleted From Beginning");
        return;
    }
    public void DeleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        Node previous =null;
        while (temp.next!=null){
            previous=temp;
            temp=temp.next;
        }
        if(temp==head){
            head=null;
        }
        else{
            previous.next=null;
        }
        System.out.println("Val Deleted From End");
        return;
    }
    public void InsertAtAnyPosn(int pos, Node newnode){
        if(head==null){
            head=newnode;
        }temp = head;
        for (int i = 0; i < pos-1; i++) {
            temp=temp.next;
        }
        newnode.next=temp.next;
        temp.next=newnode;
        return;
    }
    public void DeleteFromAnyPosn(int pos){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        Node previous = null;
        for (int i = 0; i <= pos-1; i++) {
            previous=temp;
            temp=temp.next;
        }
        if(temp==head){
            head = null;
        }else{
            previous.next=previous.next.next;
        }
        System.out.println("Val Deleted From posn 1 ");
        return;
    }
    public void TraversalPrint(){
        if(head==null){
            System.out.println("No Element In List");
            return;
        }temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
    }
}