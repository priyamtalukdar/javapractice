package recursion;

public class fibonucci {

  public static int fib( int a){
        if(a <= 2){
            return 1;
        }else{
            return fib(a-1) + fib(a-2); 
        }
  }


    public static void main(String[] args) {
        System.out.println(fib(8));
    }
}
