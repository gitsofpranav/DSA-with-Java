public class tilling {
    public static int tillingProblem(int n) {
        //base case
        if(n==0 || n==1) {
            return 1;
        }
        //kaam
        //vertically
        int fnm1 = tillingProblem(n-1);

        // horizontally
        int fnm2 = tillingProblem(n-2);

        return fnm1 + fnm2;
    }
    public static void main(String[] args) {
        System.out.println(tillingProblem(4));
    }
}
