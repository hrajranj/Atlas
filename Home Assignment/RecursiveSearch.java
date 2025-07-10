public class RecursiveSearch {
    // Recursive method to search for an element
    public static int search(int[] arr, int target, int index) {
        if (index >= arr.length) {
            return -1; // Base case: not found
        }
        if (arr[index] == target) {
            return index; // Element found
        }
        return search(arr, target, index + 1); // Recursive call
    }

    public static void main(String[] args) {
        int[] array = {3, 8, 2, 10, 15, 6};
        int target = 10;

        int result = search(array, target, 0);
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found.");
        }
    }
}
