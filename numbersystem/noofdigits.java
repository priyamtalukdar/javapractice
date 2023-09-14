package numbersystem;

public class noofdigits {

    public static void main(String[] args) {
     int n =100;
     int b= 10;
    int ans = (int) (Math.log(n) / Math.log(b)) +1;
    System.out.println(ans);
    }
}
