public class countof7 {
    public static void countof7(int[][] arr , int target) {
        int count = 0;
        for(int i=0; i<arr.length; i++) {
            for(int j=0; j<arr[0].length; j++) {
                if(arr[i][j] == target) {
                    count++;
                }
            }
        }
        System.out.println("count of 7 : " +count);
    }
    public static void main(String[] args) {
        int arr[][] = {{4,7,8},{8,8,7}};
        int target = 7;
        countof7(arr, target);
    }
}
