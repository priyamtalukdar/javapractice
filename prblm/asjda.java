package prblm;
import java.util.Scanner;
public class asjda {  
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("*");
        int i=1;
        while(i<=N){
            System.out.print("*");
            int j=1;
            while(j<=i){
                System.out.print(j);
                j=j+1;
            }
            j = j-2;
            while(j>=1){
                System.out.print(j);
                j = j-1;
            }
            System.out.print("*");
            System.out.println();
             i =i+1;
        }
           i=1;
           while(i<=N-1){
           System.out.print("*");
           int j=1;
            while(j<=N-i){
             System.out.print(j);
             j =j+1;
            }
             j =j-2;
              while(j>=1){
             System.out.print(j);
              j =j-1;
             }
            System.out.print("*");
            System.out.println();
            i =i+1;
        }System.out.println("*");
    }
}

