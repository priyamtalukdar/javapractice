package sortingtech;
import java.util.*;
public class cyclicsort {

   static void swap ( int arr[]){
    int i=0;
   while(i<arr.length){
      int correct = arr[i] -1;
      if(arr[i] != arr[correct]){
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
      }else{
        i++;
      }
    }
   }

    public static void main(String[] args) {
        int arr[] = {3,4,1,5,2};
        swap(arr);
        // for(int i =0;i<arr.length;i++){
        //     System.out.print(arr[i]);
        // }
      System.out.println(Arrays.toString(arr));
    }
}
