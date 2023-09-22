package backtaracking;
import java.util.ArrayList;
public class ways {

    // static void way (String p,int r , int c){
    //     if( r ==1 && c ==1){
    //         System.out.println(p);
    //         return ;
    //     }
    //     if(r>1){    
    //         way(p+"D",r-1,c);
    //     }
    //     if(c>1){
            
    //         way(p+"R",r,c-1);
    //     }

    // }
    static ArrayList<String> way1 (String p,int r , int c){
        if( r ==1 && c ==1){
           ArrayList <String> list = new ArrayList<>();
           list.add(p);
           return list;
        }
             ArrayList <String> list = new ArrayList<>();
         if(r>1 && c>1){    
            list.addAll(way1(p+"Diagonal ",r-1,c-1));
        }
        if(r>1){    
            list.addAll(way1(p+"DOWN ",r-1,c));
        }
        if(c>1){
            
            list.addAll(way1(p+"Right",r,c-1));
        }
    return list;
    }
    public static void main(String[] args) {
       System.out.println( way1("",3,3));
    }
}
