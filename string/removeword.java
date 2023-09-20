package string;

public class removeword {
    static void remove(String ans, String s){
      if(s.isEmpty()){
        System.out.println(ans);
        return ;
      }
     if(s.startsWith("hello")){
        remove(ans,s.substring(5));
     }else{
        remove(ans + s.charAt(0),s.substring(1));
     }

    }
 public static void main(String[] args) {
    String s= "hello world heellg";
    remove("",s);
 }   
}
