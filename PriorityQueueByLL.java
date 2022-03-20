import java.util.Scanner;
class Node12{
    int priority;
    int data;
    Node12 next;
    Node12(int data, int priority){
        this.data=data;
        this.priority=priority;
    }
}
public class PriorityQueueByLL {Node12 front=null,rear=null;
    public boolean isEmpty() {
        return (rear == null);
    }
    public void enqueue(Node12 newnode){
        if(isEmpty()){newnode.next=front;
            rear=newnode;
            front=newnode;
        }
        else{
            if(front.priority> newnode.priority){
                front.next=front;
                front=newnode;
                }
            else {
                Node12 temp = front;
                while (temp.next != null && temp.next.priority <= newnode.priority) {
                    temp = temp.next;
                }
                newnode.next = temp.next;
                temp.next = newnode;
            }
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
        Node12 temp = front;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(rear.data);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        PriorityQueueByLL obj = new PriorityQueueByLL();
        System.out.println(obj.isEmpty());
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            obj.enqueue(new Node12(s.nextInt(),s.nextInt()));
        }
        obj.traversal();
        System.out.println("Delete 1 val from queue");
        obj.dequeue();
        obj.traversal();
    }
}