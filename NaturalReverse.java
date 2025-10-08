public class NaturalReverse {
    static void reverse(int n){
        if(n<1){
            return;
        }
        reverse(n-1);
        System.out.println(n);
    }
    public static void main(String[] args) {
        int n=10;
        NaturalReverse.reverse(n);
    }
}
