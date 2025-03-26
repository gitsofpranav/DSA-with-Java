public class rec {
    public static void dec(int n) {
        if(n == 1) {
            System.out.print(n);
            return;
        }
        System.out.print(n+ " ");
        dec(n-1); 
    }
    public static void main(String[] args) {
        int n = 10;
        dec(n);
    }
}
