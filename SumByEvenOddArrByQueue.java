import java.util.Scanner;
public class SumByEvenOddArrByQueue {
    int arr[];
    int rear;
    int front;
    SumByEvenOddArrByQueue(int size){
        arr=new int[size];
        rear=front=-1;
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
    public void traversal(){
        for(int i=front;i<rear+1;i++){
            if(arr[i]!=0){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        SumByEvenOddArrByQueue obj =new SumByEvenOddArrByQueue(s.nextInt());
        int arr1[]=new int[s.nextInt()];
        for(int i=0;i<arr1.length;i++){
            arr1[i]=s.nextInt();
        }
        int sum =0;
        if(arr1.length%2==0){
            for(int i=0;i<arr1.length;i=i+2){
                arr1[i]=0;
            }
        }
        else{ for(int i=1;i<arr1.length;i=i+2){
            arr1[i]=1;
        }
        }
        for(int i=0;i<arr1.length;i++){
            sum+=arr1[i];
        }
        int ss=sum;
        int d=0;
        while(sum<10){
           if(ss>0){
               int a=ss%10;
               d+=a;
               ss/=10;
           }
           else{
               sum=d;
           }
        }
        obj.enqueue(sum);
        obj.traversal();
    }
}