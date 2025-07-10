public class SelectionSort {
 
    // Function to implement selection sort
    public static void selectionSort(int[] arr) {
        int n = arr.length; // Get the length of the array
         
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in the unsorted part
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }
            // Swap the found minimum element with the first element of the unsorted part
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
    }
 
    // Main method to test the selection sort function

    // Example usage
    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90}; // Sample array
        System.out.println("Original array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
 
        selectionSort(arr); // Call selection sort function
 
        System.out.println("Sorted array:");
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}