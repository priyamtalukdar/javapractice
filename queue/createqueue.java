package queue;

public class createqueue {
    public Node  head;
    class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }

   public void add(int value){
    Node node = new Node(value);
    Node temp = head;
     if(head ==  null){
        head= node;
        return ;
     }while(temp.next != null){
        temp = temp.next;
     }temp.next = node;
   } 

  public void print(){
    Node temp = head;
    while(temp != null){
      System.out.print(temp.val+" ");
      temp = temp.next;
    }System.out.println();
  }
  public int peek(){
    int peek = head.val;
    return peek;
  }
 public int pop(){
    int pop =  head.val;
    head = head.next;
    return pop;
 }
    public static void main(String[] args) {
        createqueue q = new createqueue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.print();
        System.out.println(q.peek());
        System.out.println(q.pop());
        q.print();
    }
}
