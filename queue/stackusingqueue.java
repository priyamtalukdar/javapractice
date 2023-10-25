package queue;

import java.util.Stack;

public class stackusingqueue {
  

   private Stack<Integer> stack1 = new Stack<>();
   private Stack<Integer> stack2 = new Stack<>();
    
    
    public void push(int x) {
        if(stack1.isEmpty()){
            stack1.push(x);
            return;
        }
        while(!stack1.isEmpty()){
            stack2.push(stack1.pop());
        }stack1.push(x);
        while(!stack2.isEmpty()){
            stack1.push(stack2.pop());
        }
    }
    public int pop() {
       return stack1.pop();
    }
    
    public int peek() {
       return stack1.peek();
    }
    
    public boolean empty() {
        return stack1.isEmpty();
    }
    public static void main(String[] args) {
        stackusingqueue st = new stackusingqueue();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        
        System.out.println(st.pop());
        System.out.println(st.peek());
    }
}

