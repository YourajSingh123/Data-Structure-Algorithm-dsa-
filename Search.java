public class Search {
    	public static void main(String[] args) {
		int[]arr={1,2,1,3,4,6,5};
		int target=6;
		System.out.println(Target(arr,target));
	}
	    static boolean Target(int[]nums,int target){
	      	for(int i=0; i<nums.length; i++){
		         if(nums[i]==target){
		            return true;
		    }
		}
		return false;
	}
}