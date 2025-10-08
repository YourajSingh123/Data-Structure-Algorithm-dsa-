public class Power {
    static int power(int n,int e){
        if(e==0){
            return 1;
        }
        return n*power(n,e-1);
    }
	public static void main(String[] args) {
	    int n=2;
	    int e=5;
		System.out.println(power(n,e));
	}
}