package stack;

public class createStack {
    public Node head;
    public int size = 0;
    class Node{
        int value;
        Node next;
        Node(int value){
         this.value = value;
        }
    }
    public void push(int value){
        Node newNode = new Node(value);
        if(head == null){
            head = newNode;
        }else{
            newNode.next = head;
            head = newNode;
        }size++;
    }

    public void print(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value+" ");
            temp = temp.next;
        }System.out.println();
    }
     public int pop(){
       
        int pop = 0;
        if(head == null){
            System.out.println("stack is empty");
        }else{
          pop = head.value;
          head = head.next;
        }size--;
        return pop;
     }   
    public int peek(){
        int peek = 0;
        if(head == null){
            System.out.println("stack is empty");
        }else{
          peek = head.value;
        }return peek;
    }
    public void size(){
        System.out.println(size);
    }
    public static void main(String[] args) {
        createStack stack = new createStack();
        stack.push(1);
        stack.push(2);
        stack.push(5);
        stack.print();
        System.out.println(stack.peek());
        System.out.println(stack.pop());
        stack.size(); 
        stack.print();
    }
}
