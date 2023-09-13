package recursion; 

public class factorial{

public static int fac(int a){
    if(a<=2){
        return a;
    }else{
        return a * fac(a-1);
    }
}

public static void main(String[] args) {
    System.out.println(fac(5));
}
    
}
// 0 = 0
// 1 = 1
// 2= 2
// 3 =  3*2
// 4 = 3* 2*4