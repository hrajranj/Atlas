import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {10, 7, 8, 9, 1, 5};

        System.out.println("Original List: " + Arrays.toString(arr));

        // Call quick sort
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Sorted List using Quick Sort: " + Arrays.toString(arr));
    }

    // Quick Sort Function
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // Partition the array
            int pi = partition(arr, low, high);

            // Recursively sort elements before and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    // Partition Function
    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];  // choosing last element as pivot
        int i = (low - 1);       // index of smaller element

        for (int j = low; j < high; j++) {
            // If current element is smaller than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                // Swap arr[i] and arr[j]
                int temp = arr[i]; arr[i] = arr[j]; arr[j] = temp;
            }
        }

        // Swap arr[i+1] and pivot (arr[high])
        int temp = arr[i + 1]; arr[i + 1] = arr[high]; arr[high] = temp;

        return i + 1;  // return the partition index
    }
}
