import java.util.HashSet;

public class prin {
    public static void interSection(int[] arr1, int[] arr2) {
        HashSet<Integer> inter = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        for(int i=0; i<arr1.length; i++) {
            set.add(arr1[i]);
        }
        for(int j=0; j<arr2.length; j++) {
            if(set.contains(arr2[j])) {
                inter.add(arr2[j]);
                set.remove(arr2[j]);
            }
        }
        System.out.println(inter);
        
    }
    public static void main(String[] args) {
        int arr1[] = {7,3,9};
        int arr2[] = {6,3,9,2,9,4};
        interSection(arr1, arr2);
    }
}
