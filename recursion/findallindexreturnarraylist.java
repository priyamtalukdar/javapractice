
package recursion;
import java.util.*;
public class findallindexreturnarraylist {

static ArrayList<Integer>  find(int arr[], int target,int n, ArrayList<Integer> list){
  if(n> arr.length -1){
    return list ;
  }
  if(arr[n]== target){
    list.add(n);
  } find(arr,target,n+1,list);
  return list;

 }
static ArrayList<Integer>  find2(int arr[], int target,int n){
 ArrayList<Integer> list2 = new ArrayList<>();
  if(n> arr.length -1){
    return list2 ;
  }
  if(arr[n]== target){
    list2.add(n);
  }
   ArrayList<Integer> ans1 = find2(arr, target, n+1 );
  list2.addAll(ans1);
  return list2;

 }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,5,6};
        int target = 5;
       ArrayList<Integer> ans = find(arr, target, 0 , new ArrayList<>());
        System.out.println(ans);

         System.out.println(find2(arr, target, 0 ));
    }
}
