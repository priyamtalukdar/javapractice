package numbersystem;

public class sqrt {

public static double root(int n, int p){
    int s = 0; 
    int e = n;
    double ans = 0.0;
    while(s<=e){
        int m = s + (e-s)/2;

        if(m*m == n){
           return m;
            
        } if(m*m > n){
            e = m -1;
           ans = m;
        }else{
            s = m+1;  
        }
    }
   

double incr = 0.1;
for(int i= 0 ;i<p;i++){
    while(ans * ans <= n){
       ans += incr;
    }
    ans -= incr; 
    incr /= 10;
    
}return ans;

}

    public static void main(String[] args) {
        int n = 40;
        int p =10;
         System.out.println(root(n, p));
    
    }
}
