import java.io.*;

class GFG {
    public static void main(String[] args) {
        // Declaring and initializing a 3x3 2D array
        int[][] arr = new int[3][3];

        // Getting number of rows
        System.out.println("Rows : " + arr.length);

        // Getting number of columns (using the first row)
        System.out.println("Columns : " + arr[0].length);
    }
}
