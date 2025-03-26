import java.util.*;
public class se {
    public static void union(int arr1[] , int arr2[]) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }

        for(int j=0; j<arr2.length; j++) {
            set.add(arr2[j]);
        }
       System.out.println(set);
       
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {7,3,9,6,2,4};
        union(arr1, arr2);
    }
}
