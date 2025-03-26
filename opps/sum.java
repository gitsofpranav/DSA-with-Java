public class sum {
    public static int sumNatural(int n) {

        if(n==1){
            return 1;
        }
         int snm1 = n+ sumNatural(n-1);
         int sn = n+ sumNatural(n-1);
         return sn;
    }
    public static void main(String[] args) {
        int n = 5;
        System.out.println(sumNatural(n));
    }
}
 