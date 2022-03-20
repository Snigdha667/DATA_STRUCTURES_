import java.util.Scanner;
public class IfPrimeList {Node2 head,temp;
    public void InsertAtEnd(Node2 newnode) {
        if (head == null) {
            head = newnode;
            return;
        }
        temp = head;
        while (temp.next != null)
            temp = temp.next;
        temp.next = newnode;
        newnode.previous = temp;
        return;
    }
    public void TraversalPrint(){
        if(head==null){
            System.out.println("No Element In List");
            return;
        }temp = head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        IfPrimeList obj = new IfPrimeList();
        IfPrimeList obj1 = new IfPrimeList();
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        for (int i = 0; i < a; i++) {int ii = s.nextInt();
            obj.InsertAtEnd(new Node2(ii));
            int c=0;
            for(int j=2;j<ii;j++){
                if(ii%j==0)
                    c++;
            }
            if(c==0)
                obj1.InsertAtEnd(new Node2(ii));
        }
        obj.TraversalPrint();
        System.out.println("Prime List : ");
        obj1.TraversalPrint();
    }
}
class Node2{
    Node2 next;
    Node2 previous;
    int data;
    Node2(int data){
        this.data=data;
    }
}