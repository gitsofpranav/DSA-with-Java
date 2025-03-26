public class Climb{
    public static int climbStairs(int n, int dp[]){
        if(n == 0){
            return 1;
        }
        if(n < 0){
            return 0;
        }
        if(dp[n] != 0){
            return dp[n];
        }

        dp[n] =  climbStairs(n-1,dp) + climbStairs(n-2,dp) + (climbStairs(n-3, dp));

        return dp[n];
    }
    public static void main(String[] args) {
        int n = 5;
        int dp[] = new int[n+1];
        System.out.println(climbStairs(n, dp));
    }
}