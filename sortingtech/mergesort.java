package sortingtech;
import java.util.*; 
public class mergesort {

 static int[] mergeSort(int arr[]){
    if (arr.length == 1) {
        return arr;
    }

    int mid = arr.length / 2;

    int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
    int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

    return merge(left, right);
}
 static int[] merge(int[] first,int[] second){
   int i = 0;
   int j = 0;
   int k = 0;
   int ans[] = new int[first.length + second.length];
   while(i< first.length && j< second.length){
    if(first[i] < second[j]){
     ans[k] = first[i];
     i++;
     
    }
    else{
     ans[k] = second[j];
     j++;
    
    } k++;
}
    while(i<first.length){
        ans[k] = first[i];
        k++;
        i++;
    }
    while(j<second.length){
        ans[k] = second[j];
        k++;
        j++;
    }
   return ans;
 }

    public static void main(String[] args) {
        int arr[] = {2,1,4,3,5};
        
        System.out.println(Arrays.toString(mergeSort(arr)));
    }
}
