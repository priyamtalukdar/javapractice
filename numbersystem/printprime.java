package numbersystem;

public class printprime {
 public static void main(String[] args) {
    int n =20;
    
    int i; 
    
    for(i =2;i<n;i++){
         int flag =1;
        for(int j =2;j<=i/2;j++ ){
        if(i % j == 0){
         flag = 0;
         break;
        }
        }if(flag == 1){
        System.out.println(i);
    }
    }
 }   
}
