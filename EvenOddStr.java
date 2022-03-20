import java.util.Scanner;
class Node11{
    Node11 next;
    String data;
    Node11(String data){
        this.data=data;
    }
}
public class EvenOddStr {
    public static void check(String str) {String inp = "";
            for(int j=0;j<str.length();j++){
                int a = (int) str.charAt(j);
                if(a%2==0){
                    inp+="e";
                }
                else{
                    inp+="o";
                }
            }
            insert(new Node11(inp));
        }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String [] str =new  String[s.nextInt()];
        for (int i = 0; i < str.length ; i++) {
            str[i]=s.next().toUpperCase();
            check(str[i]);
        }
    }
    static Node11 head;
    public static void insert(Node11 newnode){
        if(head==null){
            head=newnode;
        }
        else{
            Node11 temp = head;
            while(temp!=null){
                temp = temp.next;
            }
            temp = newnode;
        }
        System.out.println(newnode.data);
    }
}