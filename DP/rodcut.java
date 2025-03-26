public class rodcut {
    public static int rodCutting(int length[], int prices[], int rodLength){
        int p = prices.length;
        int dp[][] = new int[p+1][rodLength+1];

        for(int i=1; i<p+1; i++){
            for(int j=1; j<rodLength+1; j++){
                if(length[i-1] <= j){
                    dp[i][j] = Math.max(prices[i-1] + dp[i][j-length[i-1]], dp[i-1][j]);
                } else {
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        print(dp);
        return dp[p][rodLength];
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
        int length[] = {1,2,3,4,5,6,7,8};
        int prices[] = {1,5,8,9,10,17,17,20};
        int rodLength = 8;

        System.out.println(rodCutting(length, prices, rodLength));
    }
}
