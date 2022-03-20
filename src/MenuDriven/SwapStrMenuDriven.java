package MenuDriven;
import java.util.Scanner;
public class SwapStrMenuDriven {static String str;
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        str = s.next();
        if(str.length()>4){
            System.out.println("MENU DRIVEN :: 0- Singly LL ; 1- Doubly LL");
            switch (s.nextInt()){
                case 0:
                    SwapStrMenuDriven o = new SwapStrMenuDriven();
                    Nodee[] n = new Nodee[o.str.length()];
                    SinglyLinkedList obj = new SinglyLinkedList();
                    obj.insertBegin(new Nodee(str.substring(0,1)));
                    obj.insertBegin(new Nodee(str.substring(str.length()-1)));
                    for (int i =  o.str.length()-2; i >0; i--) {
                        n[o.str.length()-2-i]=new Nodee(str.substring(i,i+1));
                        obj.insertBegin(n[o.str.length()-2-i]);
                    }
                    System.out.println("Insert beginning :");
                    obj.insertBegin(n[1]);
                    System.out.println("Insert end : ");
                    obj.insertEnd(n[0]);
                    System.out.println("Delete Beginning : ");
                    obj.deleteFromBeginning();
                    obj.display();
                    System.out.println("Element Searched : ");
                    obj.search(n[2]);
                    System.out.println("Delete from End : ");
                    obj.deleteFromEnd();
                    obj.display();
                case 1:
                    DoublyLinkedList d = new DoublyLinkedList();
                    SwapStrMenuDriven oo = new SwapStrMenuDriven();
                    Node[] nn = new Node[oo.str.length()];
                    d.InsertAtEnd(new Node(str.substring(0,1)));
                    for (int i =  oo.str.length()-1; i >0; i--) {
                        nn[i]=new Node(str.substring(i,i+1));
                        d.InsertAtEnd(nn[i]);
                    }
                    System.out.println("MENU DRIVEN PROGRAM ::");
                    System.out.println("To insert val at end = press'0' , To insert val at beginning = press'1' , "+
                            "To insert val at any position = press'2' , To delete an element from beginning = press'3' , "+
                            "To delete val from any position = press'4' , To delete val from end = press'5' , Traversal (default) ");
                    switch (s.next()) {
                        case "0":
                            System.out.println("Insert At End : (val) ");
                            d.InsertAtEnd(new Node(s.next()));
                            d.TraversalPrint();
                            break;
                        case "1":
                            System.out.println("Insert At Beginning : (val) ");
                            d.InsertAtBeginn(new Node(s.next()));
                            d.TraversalPrint();
                            break;
                        case "2":
                            System.out.println("Insert At Any Position : (pos) , (val) ");
                            d.InsertAtAnyPosn(s.nextInt(), new Node(s.next()));
                            d.TraversalPrint();
                            break;
                        case "3":
                            d.DeleteFromBeginn();
                            d.TraversalPrint();
                            break;
                        case "4":
                            d.DeleteFromAnyPosn(1);
                            d.TraversalPrint();
                        case "5":
                            d.DeleteFromEnd();
                            d.TraversalPrint();
                        default:
                            d.TraversalPrint();
                            break;
                    }
                default:
                    System.out.println("Done Successfully");
            }
        }
        else{
            System.out.println("PLease Enter Valid String( length > 4)");
        }
    }
}