package recursion;

public class checksortedarr {

   static boolean check(int arr[],int index){
   if(arr.length -1 == index){
    return true;
   }
   return arr[index] < arr[index+1] && check(arr,index+1);
   }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,6,7,8,19,10};
        int index = 0;
        System.out.println(check(arr,index));
    }
}
