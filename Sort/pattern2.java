public class pattern2 {
    public static void pattern_2(int n) {
        //outer loop
        for(int i=1; i<=n; i++) {
            //inner loop
            for(int j=1; j<= n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n= 4;
        pattern_2(n);
    }
}
