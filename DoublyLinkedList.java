import java.util.Scanner;
class Node{
    Node next;
    Node previous;
    int data;
    Node(int data){
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
        DoublyLinkedList d = new DoublyLinkedList();
        /*System.out.println("Insert At End : (val) ");
        d.InsertAtEnd(new Node(s.nextInt()));
        d.TraversalPrint();
        System.out.println("............................................................................");
        System.out.println("Insert At End : (val) ");
        d.InsertAtEnd(new Node(s.nextInt()));
        d.TraversalPrint();
        System.out.println("............................................................................");
        System.out.println("Insert At End : (val) ");
        d.InsertAtEnd(new Node(s.nextInt()));
        d.TraversalPrint();
        System.out.println("............................................................................");
        System.out.println("Insert At End : (val) ");
        d.InsertAtEnd(new Node(s.nextInt()));
        d.TraversalPrint();
        System.out.println("............................................................................");
        System.out.println("Insert At Beginning : (val) ");
        d.InsertAtBeginn(new Node(s.nextInt()));
        d.TraversalPrint();
        System.out.println("............................................................................");
        System.out.println("Insert At Any Position : (pos) , (val) ");
        d.InsertAtAnyPosn(s.nextInt(), new Node(s.nextInt()));
        d.TraversalPrint();
        System.out.println("............................................................................");
        d.DeleteFromBeginn();
        d.TraversalPrint();
        System.out.println("............................................................................");
        d.DeleteFromAnyPosn(1);
        d.TraversalPrint();
        System.out.println("............................................................................");
        d.DeleteFromEnd();
        d.TraversalPrint();
        System.out.println("............................................................................");*/
        System.out.println("MENU DRIVEN PROGRAM ::");
        System.out.println("To insert val at end = press'0' , To insert val at beginning = press'1' , "+
                "To insert val at any position = press'2' , To delete an element from beginning = press'3' , "+
                "To delete val from any position = press'4' , To delete val from end = press'5' , Traversal (default) ");
        switch (s.next()) {
            case "0":
                System.out.println("Insert At End : (val) ");
                d.InsertAtEnd(new Node(s.nextInt()));
                d.TraversalPrint();
                break;
            case "1":
                System.out.println("Insert At Beginning : (val) ");
                d.InsertAtBeginn(new Node(s.nextInt()));
                d.TraversalPrint();
                break;
            case "2":
                System.out.println("Insert At Any Position : (pos) , (val) ");
                d.InsertAtAnyPosn(s.nextInt(), new Node(s.nextInt()));
                d.TraversalPrint();
                break;
            case "3":
                d.DeleteFromBeginn();
                d.TraversalPrint();
                break;
            case "4":
                d.DeleteFromAnyPosn(1);
                d.TraversalPrint();
            case "5":
                d.DeleteFromEnd();
                d.TraversalPrint();
            default:
                d.TraversalPrint();
                break;
        }
    }
}