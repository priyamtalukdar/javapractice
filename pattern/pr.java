
package pattern;

public class pr {
    public static void pattern (int r){
       
   for(int i = 1;i<=r;i++){
    for(int j =1;j<=i;j++){
        System.out.print(j +" ");
    }System.out.println();
   }
}
 public static void print(int r){
    if(r == 0){
        return ;
    }
     print(r-1);
    for(int i=1;i<=r;i++){
 System.out.print(i); 
    }System.out.println();
   
 }

    public static void main(String[] args) {
        print(6);
        //pattern(6);
    }
}
