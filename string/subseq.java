package string;

public class subseq {

    static void subseq(String ans, String s){
     if(s.isEmpty()){
        System.out.println(ans);
        return ;
     }
     char ch = s.charAt(0);
     subseq(ans+ch,s.substring(1));
     subseq(ans,s.substring(1));
     
    }
 public static void main(String[] args) {
    String s = "abc";
    subseq("", s);
    
 }   
}
