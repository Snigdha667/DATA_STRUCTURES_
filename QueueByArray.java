import java.util.Scanner;
public class QueueByArray {
    int arr[];
    int front;
    int rear;
    public QueueByArray(int size){
        arr= new int[size];
        front = rear =-1;
    }
    public boolean isEmpty(){
        if(front==-1 ){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(rear==arr.length-1){
            return true;
        }return false;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Array is already full.");
        }
        else if(isEmpty()){rear++;
            front++;
            arr[rear]=data;
        }
        else{
            rear++;
            arr[rear]=data;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Array is alredy empty");
        }
        else {
            arr[front] = 0;
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else {
                front++;
            }
        }
    }
    public void traversal(){
        for(int i=front;i<rear+1;i++){
            if(arr[i]!=0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        QueueByArray obj = new QueueByArray(s.nextInt());
        System.out.println(obj.isEmpty());
        for(int i=0;i<obj.arr.length;i++){
            obj.enqueue(s.nextInt());
        }
        obj.traversal();
        System.out.println(obj.isFull());
        System.out.println("Delete 1 val from queue");
        obj.dequeue();
        obj.traversal();
    }
}