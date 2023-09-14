package recursion;

public class count0 {

    public static int count(int n){
        return helper(n,0);
    }
    public static int helper(int n, int cnt){
        int rem = 0;
        
 if(n == 0 ){
    return cnt;
 }
 
 rem = n%10;
 if(rem == 0){
   return helper(n/10,cnt+1);
 }
 return helper(n/10,cnt);
    }
    public static void main(String[] args) {
        System.out.println(count(102030));
    }
}
