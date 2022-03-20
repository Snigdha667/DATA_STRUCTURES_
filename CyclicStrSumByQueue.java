import java.util.Scanner;
public class CyclicStrSumByQueue {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str[] = new String[s.nextInt()];
        CyclicStrSumByQueue obj = new CyclicStrSumByQueue();
        if(str.length<=3){
            for(int i=0;i<str.length;i++){
                str[i]=s.next();
                int sum=0;
                for(int j=0;j<str[i].length();j++){
                    for(int k = j;k<str[i].length(); k++){
                        sum+=(int) str[i].charAt(k)-'0';
                    }
                }
                obj.enqueue(new Node15(sum));
            }
            obj.traversal();
        }
        else {
            System.out.println("Input String Array Of Valid Length (3)");
        }
    }
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
    public void traversal(){
        Node15 temp = front;
        while(temp!=rear){
            System.out.println(temp.data);
            temp=temp.next;
        }
        System.out.println(rear.data);
    }
}