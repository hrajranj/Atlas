import java.util.*;

public class FibonacciSeries {
    static int[] memo;

    static int fib(int n) {
        if (n <= 1) return n;

        if (memo[n] != -1) return memo[n]; // Already calculated

        memo[n] = fib(n - 1) + fib(n - 2); // Store and return
        return memo[n];
    }

    public static void main(String[] args) {
        int n = 10;
        memo = new int[n + 1];
        Arrays.fill(memo, -1);

        System.out.println("Fibonacci number at position " + n + " is: " + fib(n));
    }
}
