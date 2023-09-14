package recursion;

public class sumofnnumber {
    public static int sum(int num){
        int rem=0;
        int ans =0;
        if(num<1){
         return 0;
        }
        rem = num%10;
        ans = rem + sum(num/10);
       return ans;

        
    }
    public static void main(String[] args) {
      System.out.println(sum(1234));  
    }
}
