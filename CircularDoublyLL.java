import java.util.Scanner;

public class CircularDoublyLL {
    //insert at end  **
    //insert at begin  **
    //insert at given pos
    //delete from begin , pos , end
    //count no. of nodes  --
    //traverse  **
    Node head;
    Node tail;
    Node temp;

    public void InsertAtEnd(Node newnode) {
        if (head == null) {
            head = newnode;
            newnode.next=head;
            return;
        }
        temp = head;
        while (temp.next != head & temp.next!=null)
            temp = temp.next;
        temp.next = newnode;
        tail = temp.next;
        head.previous=tail;
        newnode.previous = temp;
        return;
    }

    public void InsertAtBeginn(Node newnode) {
        if (head == null) {
            head = newnode;
            newnode.next=head;
            return;
        }
        head.previous = newnode;
        newnode.next = head;
        head = head.previous;
        temp = head;
        while ( temp.next != head)
            tail = temp;
        head.previous=tail;
        return;
    }

    public void DeleteFromBeginn() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.previous = null;
        tail.next=head;
        System.out.println("Val Deleted From Beginning");
        return;
    }

    public void DeleteFromEnd() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        Node previous = null;
        while (temp.next != head) {
            previous = temp;
            temp = temp.next;
        }
        if (temp == head) {
            head = null;
            head.previous=tail;
        } else {
            previous.next = null;
        }
        System.out.println("Val Deleted From End");
        return;
    }

    public void InsertAtAnyPosn(int pos, Node newnode) {
        if (head == null) {
            head = newnode;
            head.previous=tail;
        }
        temp = head;
        for (int i = 0; i < pos - 1; i++) {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
        head.previous=tail;
        return;
    }

    public void DeleteFromAnyPosn(int pos) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        Node previous = null;
        for (int i = 0; i <= pos - 1; i++) {
            previous = temp;
            temp = temp.next;
        }
        if (temp == head) {
            head = null;
            tail.next=head.next;
        } else {
            previous.next = previous.next.next;
            head.previous=tail;
        }
        System.out.println("Val Deleted From posn 1 ");
        return;
    }

    public void TraversalPrint() {
        if (head == null) {
            System.out.println("No Element In List");
            return;
        }
        temp = head;
        while (temp.next!=null & temp.next!= head ) {
            System.out.println(temp.data);
            temp = temp.next;
        }
        System.out.println(temp.data);
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CircularDoublyLL d = new CircularDoublyLL();
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
        System.out.println("Insert At End : (val) ");
        d.InsertAtEnd(new Node(s.nextInt()));
        d.TraversalPrint();
        //System.out.println("............................................................................");
        //System.out.println("Insert At Beginning : (val) ");
        //d.InsertAtBeginn(new Node(s.nextInt()));
        //d.TraversalPrint();
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
        System.out.println("............................................................................");
    }
}