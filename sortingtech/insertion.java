package sortingtech;

public class insertion {
 
    static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j>0;j--){
                if(arr[j]< arr[j-1]){
                    int temp =arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        } 

    }
    public static void main(String[] args) {
        int arr[] = {3,4,1,5,2};
        sort(arr);
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]);
        }
    }

}
