package stack;

public class stack {
   public Node head;
   public int size;

   class Node{
     int val ;
     Node next;
     Node(int val){
        this.val=  val;
     }
   }
   public  void  push(int val){
    Node newNode =  new Node(val);
    if(head ==  null){
       head = newNode;       
    }else{
       newNode.next = head;
       head = newNode;
    }
   }
   public void print(){
    Node temp =  head;
    while(temp !=  null){
      System.out.print(temp.val+" ");
      temp = temp.next;
    }
   }
  public int pop(){
   int pop =0;
   if(head ==  null){
    System.out.println("stack is empty");
   }else{
    pop =  head.val;
    head =  head.next;
   }return pop;
  }
  public int peek(){
    int peek = head.val;
    return peek;
  }
 public static void main(String[] args) {
    stack st = new stack();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.print();
    System.out.println(st.peek());
    System.out.println(st.pop());
    st.print();
 }

}
