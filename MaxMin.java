public class MaxMin {
    public static void main(String[] args) {
       int[]arr={14,8,90,56,43,15,34};
    int max=arr[0];
    int min=arr[0];
    for (int i=0; i<arr.length-1; i++) {
        if(arr[i]>max){
            max=arr[i];
        }
        if(arr[i]<min) {
               min=arr[i];
            }

    }
    System.out.println("Max:" +max); 
    System.out.println("Min:" + min);

   }
}
