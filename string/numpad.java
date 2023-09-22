package string;

public class numpad {
    static void num(String p, String s){
      if(s.length() == 0){
        System.out.println(p);
        return ;
      }
     int digit = s.charAt(0) -'0';
     for(int i = (digit -1) *3;i<digit*3;i++){
        char ch = (char) ('a'+i);
        num(p+ch,s.substring(1));
     }


    }
    public static void main(String[] args) {
        num("","12");
    }
}
