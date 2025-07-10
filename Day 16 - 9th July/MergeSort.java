import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        // Example list
        int[] arr = {38, 27, 43, 3, 9, 82, 10};

        System.out.println("Original List: " + Arrays.toString(arr));

        // Sort using merge sort
        mergeSort(arr, 0, arr.length - 1);

        System.out.println("Sorted List using Merge Sort: " + Arrays.toString(arr));
    }

    // Merge Sort Function
    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = left + (right - left) / 2;

            // Sort left half
            mergeSort(arr, left, mid);
            // Sort right half
            mergeSort(arr, mid + 1, right);
            // Merge sorted halves
            merge(arr, left, mid, right);
        }
    }

    // Merge Function
    public static void merge(int[] arr, int left, int mid, int right) {
        // Sizes
        int n1 = mid - left + 1;
        int n2 = right - mid;

        // Temp arrays
        int[] L = new int[n1];
        int[] R = new int[n2];

        // Copy data
        for (int i = 0; i < n1; i++) L[i] = arr[left + i];
        for (int j = 0; j < n2; j++) R[j] = arr[mid + 1 + j];

        // Merge temp arrays back into original
        int i = 0, j = 0, k = left;
        while (i < n1 && j < n2)
            arr[k++] = (L[i] <= R[j]) ? L[i++] : R[j++];
        while (i < n1) arr[k++] = L[i++];
        while (j < n2) arr[k++] = R[j++];
    }
}
