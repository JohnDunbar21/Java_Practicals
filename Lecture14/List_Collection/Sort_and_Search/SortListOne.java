/*
Taken from Dietel & Dietel textbook "Java: How to Program Early Objects".

Figure 16.6

Collection sort method demonstration.
*/
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class SortListOne {

    public static void main(String[] args) {
        // define an array with the suits of cards
        String[] suits = {"HEARTS", "DIAMONDS", "CLUBS", "SPADES"};

        // define and display a List containing the suits as array elements
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array of elements: %s%n", list);

        // sort the array
        Collections.sort(list);
        System.out.printf("Sorted array of elements: %s%n", list);
    }
}