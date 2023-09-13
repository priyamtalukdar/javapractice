package recursion;

public class printingnumbers {

public  static void num(int a){

if(a == 0){
 System.out.print(0) ;
}else{
  System.out.print(a+" ");
  num(a-1);
}


}


    public static void main(String[] args) {
       num(5);
    }
}
