import java.util.Scanner;
public class ValPairByQueue {
    int arr[]={5,3,7,2 ,1 ,8};
    int rear;
    int front;
    int pairqueue[];
    public ValPairByQueue(){int size=arr.length*(arr.length-1)*3;
        pairqueue = new int[size];
        front=rear=-1;
    }
    public boolean isEmpty(){
        if(front==-1 ){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(rear==pairqueue.length-1){
            return true;
        }return false;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Array is already full.");
        }
        else if(isEmpty()){rear++;
            front++;
            pairqueue[rear]=data;
        }
        else{
            rear++;
            pairqueue[rear]=data;
        }
    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Array is alredy empty");
        }
        else {
            pairqueue[front] = 0;
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
            if(pairqueue[i]!=0){
                System.out.println(pairqueue[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ValPairByQueue obj = new ValPairByQueue();
        System.out.println(obj.isEmpty());
        for(int i=0;i<obj.arr.length;i++){
            for (int j = i+1; j <obj.arr.length ; j++) {
                obj.enqueue(obj.arr[i]);
                obj.enqueue(obj.arr[j]);
                obj.enqueue(obj.arr[i]*obj.arr[j]);
            }
        }
        obj.traversal();
    }
}