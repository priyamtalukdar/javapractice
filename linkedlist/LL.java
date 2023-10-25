package linkedlist;
import java.util.*;

public class LL {
    private Node head;
    private Node tail;
    private int size;

//     public LL() {
//         this.size = 0;
//     }

   
//  private class Node {
//         private int value;
//         private Node next;

//         public Node(int value) {
//             this.value = value;
//         }

//         public Node(int value, Node next) {
//             this.value = value;
//             this.next = next;
//         }
//     }
      class Node{
        int value ;
        Node next;
        Node(int value){
            this.value = value;
            this.next = next;
        }
      }
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if (tail == null) {
            tail = head;
        }
        size += 1;
    }
    public void addLast(int value){
    Node node = new Node(value);
    Node temp = head;
    if(head == null){
     head = node;
     return;
    }
    while(temp.next != null){
        temp = temp.next;
    }
    temp.next = node;

   }


    public void deleteFirst(){
        head = head.next;
        if(head == null){
            tail = head;
        }
    }
  
public void deleteLast(){

Node temp = head;
if(head.next ==null){
    head = null;
}
while(temp.next.next != null){
   temp = temp.next;
}
temp.next = null;

}
public void duplicates(){
    Node temp = head;
    while(temp.next != null){
        if(temp.next.value == temp.value){
            temp.next = temp.next.next;
        }else{
             temp = temp.next;
        }
    }
    tail = temp;
    tail.next  =null;
    }
  
     public void display(){
     Node temp = head;
     while(temp != null){
        System.out.print(temp.value + "-> " );
        temp = temp.next;
     }
     System.out.println("END");
   }

    public static void main(String[] args) {
         LL first = new LL();

        first.insertFirst(1);
        first.insertFirst(1);
        first.insertFirst(3);
        first.insertFirst(333);
        first.display();
        first.deleteFirst();
        first.display();
        first.addLast(20);
        first.display();
        first.deleteLast();
        first.display();
        first.duplicates();
        first.display();
    }

}