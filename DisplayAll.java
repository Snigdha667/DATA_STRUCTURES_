import java.util.Scanner;
public class DisplayAll {Node1 head;
    Node1 temp;
    //To display all elements of a doubly linked list in reverse order.
    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        temp=head;
        while (temp.next!=null){
            temp=temp.next;
        }
        while (temp!=null){
            System.out.println(temp.data);
            temp=temp.previous;
        }
    }
    public void InsertAtEnd(Node1 newnode) {
        if (head == null) {
            head = newnode;
            return;
        }
        temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newnode;
        newnode.previous = temp;
        return;
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        DisplayAll da = new DisplayAll();
        int a=s.nextInt();
        for (int i = 0; i < a; i++) {
            da.InsertAtEnd(new Node1(s.nextInt()));
        }
        da.display();
    }
}
class Node1{
    Node1 next;
    Node1 previous;
    int data;
    Node1(int data){
        this.data=data;
    }
}