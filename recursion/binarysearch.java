package recursion;

public class binarysearch {
    
public static int search(int arr[], int target,int s, int e){
  if(s>e){
    return -1;
  }
  int mid = s + (e -s)/2;
  if(arr[mid] ==  target){
    return mid;
  } if(arr[mid] > target){
   return search(arr,target, s, mid -1);
  } else {
    return search(arr, target, mid+1,e);
  }
}

public static void main(String[] args) {
    int arr[] = {1, 2, 3, 4, 6, 10};
    int target = 6;
    int s = 0;
    int e = arr.length -1;
    System.out.println(search(arr,target,s,e));
}

}
