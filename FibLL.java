import java.util.Scanner;
class Node111{
    Node111 next;
    int data;
    Node111(int data){
        this.data=data;
    }
}
public class FibLL {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int max =0;
        int index[] = new int[s.nextInt()];
        for(int i=0;i<index.length;i++){
            index[i]=s.nextInt();
            if(max<index[i]){
                max = index[i];
            }
        }
        int fib[] = new int[max+1];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<max+1;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        for(int i=0;i<index.length;i++){
            insert(new Node111(fib[index[i]]));
        }
    }
    static Node111 head;
    public static void insert(Node111 newnode){
        if(head==null){
            head=newnode;
        }
        else{
            Node111 temp = head;
            while(temp!=null){
                temp = temp.next;
            }
            temp = newnode;
        }
        System.out.println(newnode.data);
    }
}