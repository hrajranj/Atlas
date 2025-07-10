import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortFriendsNames {

    public static void main(String[] args) {

        List<String> Names = new ArrayList<>(Arrays.asList("Rajeev", "Amit", "Suresh", "Vijay", "Anil", "Ranjan", "Anmol"));


        List<String> SortedNames = Names.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println("Original names: " + Names);
        System.out.println("Sorted names: " + SortedNames);
    }
}
