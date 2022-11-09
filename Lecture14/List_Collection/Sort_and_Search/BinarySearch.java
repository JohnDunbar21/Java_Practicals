/*
Taken from Dietel & Dietel textbook "Java: How to Program Early Objects".

Figure 16.12

Collection method binarySearch().
*/
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class BinarySearch {

    private static void printSearchResults(List<String> list, String key) {

        System.out.printf("%nSearching for: %s%n", key);
        int result = Collections.binarySearch(list, key);

        if(result >= 0) {
            System.out.printf("Found at index %d%n", result);
        }
        else {
            System.out.printf("Not found (%d)%n", result);
        }
    }

    public static void main(String[] args) {
        String[] colours = {"RED", "WHITE", "BLUE", "BLACK", "YELLOW", "PURPLE", "TAN", "PINK"};
        List<String> list = new ArrayList<>(Arrays.asList(colours));

        Collections.sort(list);
        System.out.printf("Sorted ArrayList: %s%n", list);

        printSearchResults(list, "BLACK");
        printSearchResults(list, "RED");
        printSearchResults(list, "PINK");
        printSearchResults(list, "AQUA");
        printSearchResults(list, "GRAY");
        printSearchResults(list, "TEAL");
    }
}