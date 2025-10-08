public class ArraySum {
    public static void main(String[] args) {
        int[][]arr={
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        int sum=0;
        int count=0;

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                 int num=arr[i][j];
                 sum+=num;
                 if(num%2==0){
                    count++;
                 }
                 System.out.println(num);
            }
        }
        System.out.println("sum=" +sum);
        System.out.println("count=" +count);
    }
}
