public class TailRecursive {
    static int go(int n, int a){
        if(n==0){
            return a;
        }
        return go((n-1),(a*n));
    }
    static int fact(int n){
       int res = go(n,1);
       return res;
    }
	public static void main(String[] args) {
	    int n=6;
	    int a=1;
 		System.out.println(fact(n));
	}
}