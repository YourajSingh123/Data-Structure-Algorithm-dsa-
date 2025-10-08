public class MergedSortedArrays {
     public static void main(String[]args){
        int[]arr1={10,20,30,35};
        int[]arr2={15,25,31,89,40,50};

        int[]arr3 = new int[arr1.length + arr2.length];
        int i=0,j=0,k=0;

        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]){
                arr3[k]=arr1[i];
                i+=1;
            }else{
                arr3[k]=arr2[j];
                j+=1;
            }
            k+=1;
        }

        while(i<arr1.length){
            arr3[k]=arr1[i];
            i+=1;
            k+=1;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            j+=1;
            k+=1;
        }
        for(int num:arr3){
            System.out.print(num + ",");
        }
     }
}
