package recursion;
import java.util.*;
public class findallindexarraylist {

static ArrayList<Integer> list =  new ArrayList<>();
 public static void find(int arr[], int target,int n){
  if(n> arr.length -1){
    return ;
  }
  if(arr[n]== target){
    list.add(n);
  } find(arr,target,n+1);

 }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,6};
        int target = 5;
        find(arr,target,0);
        System.out.println(list);
    }
}
