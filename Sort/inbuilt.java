import java.util.Collections;
import java.util.Arrays;
public class inbuilt {
    public static void main(String[] args) {
     Integer[] arr = {3,5,6,21,4,42,5456,7,88,};
     Arrays.sort(arr, Collections.reverseOrder());
     System.out.println("Sorted Array in decending Order: " + Arrays.toString(arr));
    }
}
