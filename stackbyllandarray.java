package Nodes;

import java.util.Scanner;

public class Dnode {
    private Dnode next;
    private Dnode previous;
    private int data;
    public Dnode(){
        Scanner s = new Scanner(System.in);
        setData(s.nextInt());
    }

    public Dnode getNext() {
        return next;
    }
    public void setNext(Dnode next) {
        this.next = next;
    }
    public Dnode getPrevious() {
        return previous;
    }
    public void setPrevious(Dnode previous) {
        this.previous = previous;
    }
    public int getData() {
        return data;
    }
    public void setData(int data) {
        this.data = data;

    }
}
package stackbyllandarray;
import Nodes.Dnode;
import java.util.Scanner;
public class StackByLinkedList {
    Dnode top,head;
    public boolean isEmpty(){
        if(top==null)
            return true;
        return false;
    }
    public void push(Dnode newnode){
        if(top==null) {
            top=newnode;
            head=top;
            return;
        }
        top.setNext(newnode);
        top=top.getNext();
        return;
    }
    public void pop(){
        if(isEmpty()) {
            System.out.println("StackUnderFlow");
            return;
        }
        Dnode temp = head;
        while(temp.getNext().getNext()!=null)
            temp=temp.getNext();
        if(temp.getNext()!=null & temp.getNext().getNext()==null)
            temp.setNext(null);
        top=temp;
    }
    public void traverse(){
        Dnode temp = head;
        while(temp!=null){
            System.out.println(temp.getData());
            temp=temp.getNext();
        }
    }
}
class StackByArray {
    int arr[];
    int top;

    public StackByArray(int size) {
        top = 0;
        arr = new int[size];
    }

    public boolean isFull() {
        if (top == arr.length)
            return true;
        return false;
    }

    public boolean isEmpty() {
        if (top == 0)
            return true;
        return false;
    }

    public void push(int val) {
        if (isFull())
            System.out.println("StackOverFlow");
        else {
            arr[top] = val;
            top = top + 1;
        }
        System.out.println("Value Inserted Successfully");
    }

    public void pop() {
        if (isEmpty())
            System.out.println("StackUnderFlow");
        else {
            top = top - 1;
            arr[top] = 0;
        }
    }
}
class Choose {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("PLease choose execution way :: 0 : stack by array, 1 : stack by linked list ");
        try {
            switch (s.next()) {
                case "0":
                    StackByArray sba = new StackByArray(s.nextInt());
                    System.out.println("please choose operation :: a : is full, b : is empty, c : push, d : pop.");
                    switch (s.next()) {
                        case "a":
                            System.out.println(sba.isFull());
                            break;
                        case "b":
                            System.out.println(sba.isEmpty());
                            break;
                        case "c":
                            sba.push(s.nextInt());
                            for (int i = 0; i < sba.arr.length; i++) {
                                System.out.println(sba.arr[i]);
                            }
                            break;
                        case "d":
                            sba.pop();
                            for (int i = 0; i < sba.arr.length; i++) {
                                System.out.println(sba.arr[i]);
                            }
                            break;
                        default:
                            System.out.println("Please choose an option (a/b/c/d)");
                    }
                    break;
                case "1":
                    StackByLinkedList sbll = new StackByLinkedList();
                    System.out.println("please choose operation :: a : is empty, b : push, c : pop, default : traverse.");
                    switch (s.next()) {
                        case "a":
                            System.out.println(sbll.isEmpty());
                            sbll.traverse();
                            break;
                        case "b":
                            sbll.push(new Dnode());
                            sbll.traverse();
                            break;
                        case "c":
                            sbll.pop();
                            sbll.traverse();
                            break;
                        default:
                            sbll.traverse();
                    }
                    break;
                default:
                    System.out.println("please choose an option : (1/0)");
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}