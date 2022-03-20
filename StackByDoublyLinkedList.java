import java.util.Scanner;

public class StackByDoublyLinkedList {Node5 top=null,head;
  public boolean isEmpty(){
     if(top==null)
         return true;
     else{return false;}
  }
  public void push(Node5 newnode){
      if(isEmpty()){
          top=newnode;
          head=top;
          System.out.println("1st val pushed");
          return;
      }
      top.next=newnode;
      top=top.next;
      top.next.previous=top;
      System.out.println("val pushed");
      return;
  }
  public void pop(){
      if(isEmpty())
          System.out.println("List is already empty");
      else{top=top.previous;
          top.next=null;
      }
  }
  public void traverse(){
      if(isEmpty())
          System.out.println("List is empty");
      else{top=head;
          while (top!=null){
          System.out.println(top.data);
          top=top.next;
      }top=top.previous;
          //System.out.println(head.data);

      }
  }

    public static void main(String[] args) { Scanner s = new Scanner(System.in);
      int a = s.nextInt();
        StackByDoublyLinkedList sdll = new StackByDoublyLinkedList();
        for (int i = 0; i < a; i++) {sdll.push(new Node5(s.nextInt()));
        }sdll.traverse();
        sdll.pop();
        sdll.traverse();
        System.out.println(sdll.isEmpty());
    }
}
class Node5 {
    Node5 next;
    Node5 previous;
    int data;
    public Node5(int data){
        this.data=data;
    }
}