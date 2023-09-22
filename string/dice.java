package string;

public class dice {

    static void answer(String s , int target){
        if(target == 0){
            System.out.println(s);
            return ;
        }
        for(int i=1;i<=6 && i<=target;i++){
         answer(s+i,target-i);
        }
    }
    public static void main(String[] args) {
        answer("",5);
    }
}
