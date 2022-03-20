import java.util.Scanner;

class Node15{
    int data;
    Node15 next;
    Node15(int data){
        this.data=data;
    }
}
public class QueueByLL {
    Node15 front = null, rear = null;
    public boolean isEmpty() {
        return (rear == null);
    }

    public void enqueue(Node15 newnode) {
        if (isEmpty()) {
            rear = newnode;
            front = newnode;
        }
        else {
            rear.next=newnode;
            rear=rear.next;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("List is Already Empty");
        }
        else{
            if(rear==front){
                rear=null;
                front=null;
            }
            else{
                front = front.next;
            }
        }
    }
    public void traversal(){
        Node15 temp = front;
        while(temp!=rear){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(rear.data);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        QueueByLL obj = new QueueByLL();
        System.out.println(obj.isEmpty());
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            obj.enqueue(new Node15(s.nextInt()));
        }
        obj.traversal();
        System.out.println("Delete 1 val from queue");
        obj.dequeue();
        obj.traversal();
    }
}