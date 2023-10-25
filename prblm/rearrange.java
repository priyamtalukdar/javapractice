package prblm;
import java.util.*;
public class rearrange {

    public static int[] result(int[] arr) {
        List<Integer> posnum = new ArrayList<>();
        List<Integer> negnum = new ArrayList<>();
        for (int num : arr) {
            if (num < 0) {
                negnum.add(num);
            } else {
               posnum.add(num);
            }
        }
        
        int[] result = new int[arr.length];
        int i = 0;
        int p = 0, n = 0;
        while (p < posnum.size() && n < negnum.size()) {
            result[i++] = posnum.get(p++);
            result[i++] = negnum.get(n++);
        }
        while (p < posnum.size()) {
            result[i++] = posnum.get(p++);
        }
        while (n < negnum.size()) {
            result[i++] = negnum.get(n++);
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter the number of elements  ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Please enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int[] answer = result(arr);
        for (int num : answer) {
            System.out.print(num + " ");
        }
    }
}

//The time complexity of this code is 0(n).
//The space complexity of this code is 0(n).
//1>  [1,2,3,4,5,6] ,[-1,-2,-4,-5] All number in the array is either fully negetive or positive . So for that case i made the loop run till all pos and negetive number are inserted in array  
//    as written from line 22 to 26.
//2> [1,3,-2,-5,5,,-10] one is normal test case where total number of positive number is equal to negetive number.
//3> [1,2,-1,2,5,6,-2,-7] The trickiest case when total number of positive number is not equal to negetive number and the distance from positive number is greater than 2 . So i made an arraylist
//to tackel this test case.
