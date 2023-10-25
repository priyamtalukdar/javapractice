package linkedlist;

public class LL1 {

    public class Node {
        int value;
        Node next;
        Node(int value){
            this.value = value;
            this.next = next;
        }
      Node head;
      Node tail;

       
         public void insertFirst(int value){
           Node node = new Node(value);
            node.next = head;
            head = node;
    
          if(tail== null){
           tail = head;
          }
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
       Node temp =  head;
    while(temp != null){
        System.out.print(temp + "->");
        temp = temp.next;
    }System.out.println("end");
      }

    }
  public static void main(String[] args) {
    LL first = new LL();
    first.insertFirst(1);
    first.insertFirst(1);
    first.insertFirst(1);
    first.insertFirst(2);
    first.insertFirst(3);
    first.insertFirst(3);
    first.display();
    first.duplicates();
    first.display();
  }  
}
