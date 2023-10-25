package sortingtech;

public class bubblesort {

    static void sort(int arr[]){
       int temp, i,j;
        int n = arr.length;
        for( i= 0 ;i< n -1;i++){
            for( j=0; j < n-1-i;j++){
                if(arr[j] > arr[j+1]){
                  temp = arr[j];
                  arr[j] = arr[j+1];
                  arr[j+1] = temp;
                }
            }
            
        }
    }
    // 
    public static void main(String[] args) {
        int arr[] = {3,1,5,4,2};
         sort(arr);
        for(int i = 0;i<arr.length ;i++){
            System.out.print(arr[i]);
        }
    }
}
