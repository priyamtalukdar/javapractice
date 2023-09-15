package numbersystem;

public class isprime {
    public static void main(String[] args) {
        int n =  19;
        boolean ans = true;
        for(int i=2;i<n/2;i++){
            if(n%i == 0){
            ans = false;
            }
        }System.out.println(ans);
    }
}
