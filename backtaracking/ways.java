// // package backtaracking;
// // import java.util.ArrayList;
// // public class ways {

// //     // static void way (String p,int r , int c){
// //     //     if( r ==1 && c ==1){
// //     //         System.out.println(p);
// //     //         return ;
// //     //     }
// //     //     if(r>1){    
// //     //         way(p+"D",r-1,c);
// //     //     }
// //     //     if(c>1){
            
// //     //         way(p+"R",r,c-1);
// //     //     }

// //     // }
// //     static ArrayList<String> way1 (String p,int r , int c){
// //         if( r ==1 && c ==1){
// //            ArrayList <String> list = new ArrayList<>();
// //            list.add(p);
// //            return list;
// //         }
// //              ArrayList <String> list = new ArrayList<>();
// //          if(r>1 && c>1){    
// //             list.addAll(way1(p+"Diagonal ",r-1,c-1));
// //         }
// //         if(r>1){    
// //             list.addAll(way1(p+"DOWN ",r-1,c));
// //         }
// //         if(c>1){
            
// //             list.addAll(way1(p+"Right",r,c-1));
// //         }
// //     return list;
// //     }
// //     public static void main(String[] args) {
// //        System.out.println( way1("",3,3));
// //     }
// // }
// import java.util.*;

// public class rearrange {

//     public static int[] alternateArrangement(int[] arr) {
//         List<Integer> positiveNums = new ArrayList<>();
//         List<Integer> negativeNums = new ArrayList<>();
//         int answer[]  =new int[arr.length];

//         for (int num : arr) {
//             if (num > 0) {
//                 positiveNums.add(num);
//             } else if (num < 0) {
//                 negativeNums.add(num);
//             }
//         }
//         int i = 0;
//         int j = 0;
//         while (i < positiveNums.size() && j < negativeNums.size()) {
//             answer[i] =positiveNums.get(i);
//             answer[j] =negativeNums.get(j);
//             i++;
//             j++;
//         }

//         while (i < positiveNums.size()) {
//             answer[i] = positiveNums.get(i);
//             i++;
//         }
//         while (j < negativeNums.size()) {
//             answer[i] = negativeNums.get(j);
//             j++;
//         }
//         return answer;
//     }

//     public static void main(String[] args) {
//         int[] inputArray = {-3, 1, 2, 4, -6, 8, -8, -1};
//         int[] result = alternateArrangement(inputArray);
//         for (int num : result) {
//             System.out.print(num + " ");
//         }
// }

// }
