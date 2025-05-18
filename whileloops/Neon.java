public class Neon{
    public static void main(String[] args){
        int i=9;
        int temp=i;
        int square=i*i;
        int sum=0;
        while(square>0){
            int res=square%10;
            sum=sum+res;
            square=square/10;
         }
         if(sum==temp){
            System.out.println("it is a neon number");
         }else{
            System.out.println("it is a not a neon number");
         }
    }
}