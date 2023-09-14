package numbersystem;

public class duplicate {
 
    public static int check(int arr[]){
        int ans = 0;
        // for(int i=0;i<arr.length;i++){
        //     ans ^=  arr[i];
        // }return ans;
       
        for(int n : arr){
          ans ^= n;
        }return ans;
    }
 
    public static void main(String[] args) {
    
    int arr[] = {2,2,1,2,1,2,4,5,4};
    System.out.println(check(arr));
 }   
}
