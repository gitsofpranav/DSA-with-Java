public class coin {
    public static int coinWays(int coin[], int sum){
        int n = coin.length;
        int dp[][] = new int[n+1][sum+1];
        for(int i=0; i<n+1; i++){
            dp[i][0] = 1;
        }

        for(int j=1; j<sum+1; j++){
            dp[0][j] = 0;
        }

        for(int i=1; i<n+1; i++){
            for(int j=1; j<sum+1; j++){
                if(coin[i-1] <= j){ //valid condition
                    dp[i][j] = dp[i][j-coin[i-1]] + dp[i-1][j];
                } else { // invalid 
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);    
        return dp[n][sum];
    }
    public static void print(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int coin[] = {2,5,3,6};
        int sum = 10;
        System.out.println(coinWays(coin, sum));
    }
}
 