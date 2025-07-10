public class ArrayCopyRecursive {
    // Recursive method to copy elements
    public static void copyArray(int[] source, int[] destination, int index) {
        if (index >= source.length) {
            return; // Base case: copied all elements
        }
        destination[index] = source[index]; // Copy current element
        copyArray(source, destination, index + 1); // Recursive call
    }

    public static void main(String[] args) {
        int[] original = {5, 10, 15, 20, 25};
        int[] copy = new int[original.length];

        copyArray(original, copy, 0);

        System.out.print("Copied array: ");
        for (int num : copy) {
            System.out.print(num + " ");
        }
    }
}
