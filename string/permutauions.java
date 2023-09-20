package string;

public class permutauions {
   static void perm(String p, String s){
    if(s.length() == 0){
        System.out.println(p);
        return ;
    }
    char ch = s.charAt(0);
    for(int i=0;i<=p.length();i++){
        String f = p.substring(0,i); 
        String l = p.substring(i,p.length());
        perm(f+ ch + l , s.substring(1)); 
    }
   }
    public static void main(String[] args) {
      perm("","abc"); 
    }
}
