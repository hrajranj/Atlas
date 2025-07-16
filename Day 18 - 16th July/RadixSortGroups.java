import java.util.*;

public class RadixSortGroups {

    // Radix Sort function
    public static void radixSort(int[] arr) {
        int max = getMax(arr);
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }

    // Get maximum number
    private static int getMax(int[] arr) {
        int max = arr[0];
        for (int val : arr) {
            if (val > max) max = val;
        }
        return max;
    }

    // Counting Sort by digit (used in radix sort)
    private static void countingSort(int[] arr, int exp) {
        int[] output = new int[arr.length];
        int[] count = new int[10];

        // Count digits
        for (int val : arr) {
            int digit = (val / exp) % 10;
            count[digit]++;
        }

        // Cumulative count
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }

        // Build output (stable sort)
        for (int i = arr.length - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }

        // Copy back
        System.arraycopy(output, 0, arr, 0, arr.length);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers separated by commas:");
        String[] input = sc.nextLine().replaceAll(" ", "").split(",");

        int[] arr = new int[input.length];
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        // Step 1: Sort the array using Radix Sort
        radixSort(arr);

        // Step 2: Group based on last digit
        List<Integer> array1 = new ArrayList<>(); // Ends with 0
        List<Integer> array2 = new ArrayList<>(); // Ends with 1
        List<Integer> array3 = new ArrayList<>(); // Others

        for (int num : arr) {
            int unit = num % 10;
            if (unit == 0)
                array1.add(num);
            else if (unit == 1)
                array2.add(num);
            else
                array3.add(num);
        }

        // Step 3: Display groups
        System.out.println("Array 1 has: " + array1);
        System.out.println("Array 2 has: " + array2);
        System.out.println("Array 3 has: " + array3);
    }
}
