/*
Taken from Dietel & Dietel textbook "Java: How to Program Early Objects".

Figure 16.16

Using SortedSets and TreeSets.
*/
import java.util.Arrays;
import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetCollection {

    private static void printSet(SortedSet<String> set) {
        for(String s: set) {
            System.out.printf("%s ", s);
        }

        System.out.println();
    }

    public static void main(String[] args) {
        String[] colours = {"YELLOW", "GREEN", "BLACK", "TAN", "GREY", "WHITE", "ORANGE", "RED", "GREEN"};
        SortedSet<String> tree = new TreeSet<>(Arrays.asList(colours));

        System.out.print("Sorted set: ");
        printSet(tree);

        // get headSet based on ORANGE
        System.out.print("headSet (\"ORANGE\"): ");
        printSet(tree.tailSet("ORANGE"));

        // get first and last elements
        System.out.printf("first: %s%n", tree.first());
        System.out.printf("last: %s%n", tree.last());
    }
}