package recursion;
import java.util.*;
public class linearsearch {

    public static int searchfirst(int arr[], int target , int start,int n){
     if(start >n){
        return -1;
     }
      if(arr[start] == target){
        return start;
      } else{
        return searchfirst(arr,target,start+1,n);
      }
      }
    public static int searchlast(int arr[], int target , int start,int n){
     if(start < 0){
        return -1;
     }
      if(arr[start] == target){
        return n-start;
      } else{
        return searchlast(arr,target,start-1,n);
      }
      }


    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
       int  n = sc.nextInt();
       int arr[] = new int [n];
        for(int i=0;i<n;i++){
              arr[i]= sc.nextInt();     
        }
        int target = sc.nextInt();
        System.out.println(searchfirst(arr,target,0,n));
        System.out.println(searchlast(arr,target,n-1,n));
    }
}
