public class ques {
    // Function to print the array
    public static void printArray(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Function to perform merge sort
    public static void solve(String[] arr, int si, int ei) {
        if (si >= ei) {
            return;
        }

        // Find the middle index
        int mid = si + (ei - si) / 2;

        // Recursively sort the left half
        solve(arr, si, mid);

        // Recursively sort the right half
        solve(arr, mid + 1, ei);

        // Merge the sorted halves
        merge(arr, si, mid, ei);
    }

    // Function to merge two sorted halves
    public static void merge(String[] arr, int si, int mid, int ei) {
        String[] temp = new String[ei - si + 1];
        int i = si; // Iterator for the left part
        int j = mid + 1; // Iterator for the right part
        int k = 0; // Iterator for the temp array

        // Compare and merge the two halves
        while (i <= mid && j <= ei) {
            if (arr[i].compareTo(arr[j]) <= 0) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left part
        while (i <= mid) {
            temp[k++] = arr[i++];
        }

        // Copy remaining elements from the right part
        while (j <= ei) {
            temp[k++] = arr[j++];
        }

        // Copy the sorted temp array back into the original array
        for (k = 0, i = si; k < temp.length; k++, i++) {
            arr[i] = temp[k];
        }
    }

    // Main function to test the sorting
    public static void main(String[] args) {
        String[] arr = { "sun", "earth", "mars", "mercury" };

        // Perform merge sort
        solve(arr, 0, arr.length - 1);

        // Print the sorted array
        printArray(arr);
    }
}
