package recursion;

public class reversestrin {

     public  static void rev(String string){
     if(string.length() == 1){
       System.out.println(string);
     } else{
       System.out.print(string.charAt(string.length() -1));
       rev(string.substring(0,string.length()-1));
     }
     
    }
    public static void main(String[] args) {
       rev("hello");
    }
}
