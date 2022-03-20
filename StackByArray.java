import java.util.Scanner;

public class StackByArray{
    int arr[];
    int top;
    public StackByArray(int size){
        top=0;
        arr=new int[size];
    }
    public boolean isFull(){
        if(top==arr.length)
            return true;
        return false;
    }
    public boolean isEmpty(){
        if(top==0)
            return true;
        return false;
    }
    public void push(int val){
        if(isFull())
            System.out.println("StackOverFlow");
        else {
            arr[top] = val;
            top = top + 1;
        }
        System.out.println("Value Inserted Successfully");
    }
    public void pop(){
        if(isEmpty())
            System.out.println("StackUnderFlow");
        else{
            top=top-1;
            arr[top]=0;
        }
    }

    public static void main(String[] args) {Scanner s = new Scanner(System.in);
        StackByArray sba = new StackByArray(s.nextInt());
        for (int i = 0; i < sba.arr.length; i++) {
            sba.push(s.nextInt());
        }
        for (int i = 0; i < sba.arr.length; i++) {
            System.out.println(sba.arr[i]);
        }
        sba.pop();
        for (int i = 0; i < sba.arr.length; i++) {
            System.out.println(sba.arr[i]);
        }
        System.out.println("Is Empty Stack :: "+sba.isEmpty());
        System.out.println("Is Full Stack :: "+sba.isFull());
    }
}