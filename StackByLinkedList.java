import java.util.Scanner;
class Node4{
    Node4 next;
    int data;
    public Node4(int data){
        this.data=data;
    }
}
public class StackByLinkedList {Node4 top,head;
    public boolean isEmpty(){
        if(top==null)
            return true;
        return false;
    }
    public void push(Node4 newnode){
        if(top==null) {
            top=newnode;
            head=top;
            return;
        }
        top.next=newnode;
        top=top.next;
        return;
    }
    public void pop(){
        if(isEmpty()) {
            System.out.println("StackUnderFlow");
            return;
        }
        Node4 temp = head;
        while(temp.next.next!=null)
            temp=temp.next;
        if(temp.next!=null & temp.next.next==null)
            temp.next=null;
        top=temp;
    }
    public void traverse(){Node4 temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StackByLinkedList sbll = new StackByLinkedList();
        int a = s.nextInt();
        for (int i = 0; i < a; i++) {
            sbll.push(new Node4(s.nextInt()));
        }
        sbll.traverse();
        sbll.pop();
        sbll.traverse();
        System.out.println("Is Stack Empty :: "+sbll.isEmpty());
    }
}