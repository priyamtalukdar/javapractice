package linkedlist;

public class createLL {
    public Node head;
    public int size = 0;
   class Node{
    int value ;
    Node next;
    Node(int value){
        this.value = value;
        this.next = next;
    }

   }
    public void insertFirst(int value){
     Node node = new Node(value);
     node.next =head;
     head = node;
     size++;
    }
    public void insertLast(int value){
        Node node = new Node(value);
        Node temp = head;
        if(head == null){
            temp = head;
        }
        while(temp.next != null){
            temp =  temp.next;
        }temp.next = node;
        size++;
    }
    public void deleteFirst(){
      head = head.next;
      size--;
    }
    public void deleteLast(){
     Node temp  = head;
     if(head.next == null){
       head = null;
     }
     while(temp.next.next != null){
        temp = temp.next;
     }temp.next = null;
     size--;
    }
    public void addindex(int value,int index){
        Node node = new Node(value);
        Node temp =  head;
        int insertind = index;
        Node cur = null;
        int start =1;
        while(insertind-1 != start){
            temp =  temp.next;
            start++;
        }cur = temp.next;
        temp.next = node;
        node.next = cur;
        size++;
    }
    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + "->");
            temp = temp.next;
        }System.out.println("end");
    }
  public void size(){
    System.out.println(size);
  }
    public static void main(String[] args) {
        createLL first = new createLL();
        first.insertFirst(1);
        first.insertFirst(2);
        first.insertFirst(3);
        first.insertLast(5);
        first.insertLast(4);
        first.insertLast(6);
        first.deleteFirst();
        first.deleteLast();
        first.print();
        first.addindex(10, 3);
        first.print();
         first.size();
    }
}
