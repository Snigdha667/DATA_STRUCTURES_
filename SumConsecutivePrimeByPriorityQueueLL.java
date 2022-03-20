import java.util.Scanner;
//no. of consequtives = priority
//sum of consequtives = number entered in LL
class Node121{
    int priority;
    int data;
    Node121 next;
    Node121(int data, int priority){
        this.data=data;
        this.priority=priority;
    }
}
public class SumConsecutivePrimeByPriorityQueueLL {
    Node121 front, rear;
    public void insert(Node121 newnode) {
        if (front == null || front.priority < newnode.priority) {
            newnode.next = front;
            front = newnode;
        } else {
            Node121 temp = front;
            while (temp.next != null && newnode.priority <= temp.next.priority) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }
    public void traversal(){
        Node121 temp = front;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {SumConsecutivePrimeByPriorityQueueLL obj = new SumConsecutivePrimeByPriorityQueueLL();
        int count1=0, c1 = 0, c=0;
        Scanner s = new Scanner(System.in);
        int sizeArr =s.nextInt();
        int arr[] = new int[sizeArr];
        for(int i=0;i<sizeArr;i++){
            arr[i]=s.nextInt();
            for(int j=2;j<arr[i];j++){
                if(arr[i]%j==0){
                    count1++;
                }
            }
            if(count1==0) {
                c1 += arr[i];
                c++;
            }
            else if(count1!=0 & c1 !=0){
                obj.insert(new Node121(c1,c ));
                c1=0;
                c=0;
                count1=0;
            }
            if(arr[i]==arr[sizeArr-1] & c1!=0){
                obj.insert(new Node121(c1, c));
            }
        }
        obj.traversal();
    }
}