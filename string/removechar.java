package string;

public class removechar {
 
   public static void remove(String ans,String s){
    if(s.isEmpty()){
        System.out.print(ans);
      return ;
    }
    char ch = s.charAt(0);
    if(ch == 'a'){
        remove(ans,s.substring(1));
    }else{
        remove(ans + ch,s.substring(1));
    } 
   }

    public static void main(String[] args) {
        String s= "abcdefa";
        remove("",s);
    }
}
