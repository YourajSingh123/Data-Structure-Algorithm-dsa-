public class SumofNatural {
    public static int findSum(int n) {
        int sum=0;
        for(int i=1; i<=n; i++){
            sum+=i;
        }
           if(n==0){
             return 0;
        }
        return sum;
    }
    
    public static void main(String[]args){
        int n=5;
        System.out.println(findSum(n));
        }
    }