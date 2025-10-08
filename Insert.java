import java.util.Arrays;
public class Insert {
    public static void main(String[] args) {
        int[]arr1={10,20,30,40,50,60};
        int idx=2;
        int element=25;
        int[]arr2=new int[arr1.length+1];
        
        for(int i=0;i<idx; i++){
            arr2[i]=arr1[i];
        }
        arr2[idx]=element;
        for(int i=idx; i<arr1.length; i++){
            arr2[i+1]=arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
    }
}
