/*
Taken from Dietel & Dietel textbook "Java: How to Program Early Objects".

Figure 16.15

HashSet used to remove duplicates from an array of strings.
*/
import java.util.List;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.Collection;

public class HashSetCollection {

    private static void printNonDuplicates(Collection<String> values) {
        // create a HashSet
        Set<String> set = new HashSet<>(values);

        System.out.printf("%nNonduplicates are: ");

        for(String value: set) {
            System.out.printf("%s ", value);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        String[] colours = {"RED", "WHITE", "BLUE", "GREEN", "GRAY", "ORANGE", "TAN", "WHITE", "CYAN", "PEACH", "GRAY", "ORANGE"};
        List<String> list = Arrays.asList(colours);
        System.out.printf("List: %s%n", list);

        // eliminate duplicates then print the unique values
        printNonDuplicates(list);
    }
}