public class kadane {
    public static int kadan(int arr[]) {
        int currentSum = 0;
        int maxSUM = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++) {
            currentSum += arr[i];
            if(currentSum<0){
                currentSum = 0;
            }
            if(maxSUM < currentSum) {
                maxSUM = currentSum;
            }
            
        }
        return maxSUM;
    }
    public static void main(String[] args) {
        int[] arr = {-2,-3,4,-1,-2,1,5,-3};
        System.out.println( "max sum is : " +kadan(arr));
        }
}
