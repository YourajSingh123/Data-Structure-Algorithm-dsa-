public class Wealth {
    static int maximumWealth(int[][] accounts) {
    
      int max=0;
       for(int i=0; i<accounts.length; i++){
        int sum=0;
        for(int j=0; j<accounts[0].length; j++){
            sum+=accounts[i][j];
        }
        if(sum>max){
            max=sum;
        }
       }  
       return max;
    }
    public static void main(String[]args){
        int[][] arr={
            {2,8,3},
            {7,1,2},
            {1,9,5}
        };
        System.out.println(maximumWealth(arr));
    }
}
