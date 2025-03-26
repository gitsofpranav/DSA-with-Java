public class fib {
   public static int fibo(int n) {
    if(n == 0 || n == 1 ) {
        return n;
    }
    int fnm1 = fibo(n-1);
    int fnm2 = fibo(n-2);
    int fn = fnm1 + fnm2;
    return fn;
   }
    public static void main(String[] args) {
        int n = 5 ;
        System.out.println(fibo(23));
        System.out.println(fibo(24));
        System.out.println(fibo(25));
        System.out.println(fibo(26));
    } 
}
