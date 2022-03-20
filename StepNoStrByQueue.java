import java.util.Scanner;
class Node115{
    boolean data;
    Node115 next;
    Node115(boolean data){
        this.data=data;
    }
}
public class StepNoStrByQueue {
    String[] str ;
    Node115 front = null, rear = null;
    public boolean isEmpty() {
        return (rear == null);
    }
    public void enqueue(Node115 newnode) {
        if (isEmpty()) {
            rear = newnode;
            front = newnode;
        }
        else {
            rear.next=newnode;
            rear=rear.next;
        }
    }
    public void traversal(){
        Node115 temp = front;
        while(temp!=rear){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(rear.data);
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        StepNoStrByQueue obj = new StepNoStrByQueue();
        obj.str=new String[s.nextInt()];
        for(int i=0;i<obj.str.length;i++){
            obj.str[i]=s.next();
            int c=0;
            for(int j=1;j<obj.str[i].length();j++){
                if((obj.str[i].charAt(j-1)-obj.str[i].charAt(j))==1 | (obj.str[i].charAt(j-1)-obj.str[i].charAt(j))==-1){
                    c++;
                }
            }
            if(c==obj.str[i].length()-1){
                obj.enqueue(new Node115(true));
            }
            else{
                obj.enqueue(new Node115(false));
            }
        }
        obj.traversal();
    }
}