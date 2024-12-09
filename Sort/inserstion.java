
public class inserstion {
    public static void inserstion_sort(int[] arr) {
        for(int i=1; i<arr.length; i++) {
            int current = arr[i];
            int prev = i-1;
            while(prev >=0 && arr[prev] > current) {
                arr[prev+1] = arr[prev];
                prev--;
            }
            // inserstion
            arr[prev+1] = current;
        }
    }
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {5,4,1,3,2};
        inserstion_sort(arr);
        printArray(arr);
    }
}
