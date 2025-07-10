import java.util.ArrayList; 
import java.util.List;

public class FilterOddNumbers {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(12);
        numbers.add(16);
        numbers.add(22);
        numbers.add(34);
        numbers.add(40);
        numbers.add(51);
        numbers.add(39);
        numbers.add(47);
        numbers.add(55);

        System.out.println("Odd numbers in the list:");
        numbers.stream()
               .filter(n -> n % 2 != 0) 
               .forEach(System.out::println);
    }
}
