

package recursion;
import java.util.*;
public class reversenum {

public static void  num(int a){
    if(a < 10){
        System.out.print(a);
    }else{
        System.out.print(a%10);
        num(a/10);
    }
}

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int n = sc.nextInt(); 
        num(n);
    }
}
