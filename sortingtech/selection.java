package sortingtech;

public class selection {
 
    static int max(int arr[],int last){

        int start = 0;
        int max = 0;
        for(int i=0;i<=last;i++){
            if(arr[start] < arr[i] ){
               max = i; 
            }
        }return max;
    }

static void change(int arr[], int maxind,int last){
    int temp = arr[maxind];
    arr[maxind] = arr[last];
    arr[last] = temp;     
}

    static void swap(int arr[]){
        for(int i=0;i<arr.length;i++){
            int last = arr.length -1 -i;
           int maxind =  max(arr,last);
            change(arr,maxind,last);
        }
    }

    public static void main(String[] args) {

     int arr[] = {3,2,1,4,5};   
     swap(arr);
     for(int i = 0;i<arr.length ;i++){
        System.out.print(arr[i]);
    }
    }
}
