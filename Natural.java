public class Natural {
    static int num(int n){
        if(n<1){
            return 0;
        }
        System.out.println(n);
        return num(n-1);
    }
    public static void main(String[] args) {
        int n=10;
        System.out.println(Natural.num(n));
    }
}
