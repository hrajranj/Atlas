import java.util.stream.Stream;
public class Limit{
    public static void main(String[] args) {
        Stream<Integer> nums = Stream
                .iterate(1, n -> n + 1)
                .limit(20);
        // Print the first 10 numbers
        nums.limit(10)
                .forEach(System.out::println);
    }
}
