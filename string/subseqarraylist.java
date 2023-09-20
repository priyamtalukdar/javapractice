package string;
import java.util.*;
public class subseqarraylist {

    static ArrayList<String> sub(String ans, String s ){
        if(s.isEmpty()){
         ArrayList<String> list = new ArrayList<>();
         list.add(ans);
         return list;
        }
        ArrayList<String> left = sub(ans + s.charAt(0),s.substring(1));
        ArrayList<String> right = sub(ans,s.substring(1));
        
        left.addAll(right);
        return left;
    }

    public static void main(String[] args) {
        System.out.println(sub("", "abc"));
    }
}
