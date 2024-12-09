public class selection {
    public static void selection_sort(int[] arr) {
        
        for(int turn=0; turn<arr.length-1; turn++) {
            int minpos = turn;
            for(int j=turn+1;  j<arr.length-1; j++) {
                if(arr[minpos] > arr[j]) {
                    minpos = j;
                }

            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,2,3};
    }
}
