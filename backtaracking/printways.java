package backtaracking;

public class printways {
    static int ways(int r , int c){
     
        if( c == 1 || r ==1){
            return 1;
        }
        int right = ways(r,c-1);
        int left = ways(r-1,c);
     return left +right;
    }
    public static void main(String[] args) {
       System.out.println( ways(3,3));
    }
}
