public class Delete {
    public static void main(String[] args) {
        int[]arr1={10, 20, 30, 40, 50};
        int idx=2;
        
        int[]arr2= new int[arr1.length - 1];
        for (int i=0, j=0; i<arr1.length; i++) {
            if (i==idx) 
            continue;
            arr2[j++]=arr1[i];
        }
        
        for (int i=0; i<arr2.length; i++) {
            System.out.println(arr2[i]);
        }
    }
}
