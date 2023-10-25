package pattern;

public class updw {
    public static void print(int r){
        if(r == 1){
            System.out.println(1);
            return;
        }
        for(int i=1;i<=r;i++){
     System.out.print(i); 
        }System.out.println();

         print(r-1);
        for(int i=1;i<=r;i++){
     System.out.print(i); 
        }System.out.println();
       
     }
    
        public static void main(String[] args) {
            print(6);
            //pattern(6);
        }
    }
    

