import java.util.Scanner;
public class CircularQueueByArray {
    int arr[];
    int front;
    int rear;
    public CircularQueueByArray(int size){
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
        if((rear==arr.length-1 & front ==0 )| (rear+1==front)){
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
        else{if(rear==arr.length-1){
            rear=0;
        }
        else{
            rear++;
        }
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
            else {if(front==arr.length-1){
                front=0;
            }
            else{
                front++;
            }
            }
        }
    }
    public void traversal(){int i=front;
        while(i!=rear){
            if(arr[i]!=0){
                if(i==arr.length-1){
                    System.out.println(arr[i]);
                    i=0;
                }
                else{
                    System.out.println(arr[i]);
                    i++;
                }
            }
        }
        System.out.println(arr[rear]);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        CircularQueueByArray obj = new CircularQueueByArray(s.nextInt());
        System.out.println(obj.isEmpty());
        for(int i=0;i<obj.arr.length;i++){
            obj.enqueue(s.nextInt());
        }
        obj.traversal();
        System.out.println(obj.isFull());
        System.out.println("Delete 2 val from queue");
        obj.dequeue();
        obj.dequeue();
        obj.enqueue(s.nextInt());
        obj.enqueue(s.nextInt());
        obj.traversal();
    }
}