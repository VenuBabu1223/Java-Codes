public class Armstrong {
    public static void main(String[] args){
        int i=153;
        int sum=0;
        int temp=i;
        while(i>0){
            int res=i%10;
            int cube=res*res*res;
            sum=sum+cube;
            i=i/10;
        }
        if(sum==temp){
            System.out.println("it is a Armstrong number");
        }else{
            System.out.println("it is a Not Armstrong number");
        }
    }
    
}
