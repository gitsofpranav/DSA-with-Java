import java.util.*;
public class revi {
    public static ArrayList<Integer> minMax(int arr[]){
        ArrayList<Integer> li = new ArrayList<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            min = Math.min(min,arr[i]);
            max = Math.max(max, arr[i]);
        }
        li.add(min);
        li.add(max);

        return li;
    }
    public static void main(String[] args) {
        int arr[] = {3,2,1,56,10000,167};
        System.out.println(minMax(arr));
    }
}
