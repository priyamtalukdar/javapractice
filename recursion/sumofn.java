package recursion;

import java.util.*;



public class sumofn {
public static int sum(int n){
  if(n< 1){
    return 0;
  }else{
    return n + sum(n-1);
  }
}
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
          int n =  sc.nextInt();
          System.out.println(sum(n));
    }
}
