/*
Taken from Dietel & Dietel textbook "Java: How to Program Early Objects".

Figure 16.11

Collection methods reverse, fill, copy, max, and min.
*/
import java.util.List;
import java.util.Arrays;
import java.util.Collections;

public class AlgorithmOne {

    public static void output(List<Character> listRef) {
        System.out.print("The list is: ");

        for(Character element: listRef) {
            System.out.printf("%s", element);
        }

        System.out.printf("%nMax: %s", Collections.max(listRef));
        System.out.printf("  Min: %s", Collections.min(listRef));
    }

    public static void main(String[] args) {
        // define an arbitrary character List
        Character[] letters = {'P', 'C', 'M'};
        // define a List<Character>
        List<Character> list = Arrays.asList(letters);
        System.out.println("List Contains: ");
        output(list);

        // reverse and display the List<Character>
        Collections.reverse(list);
        System.out.printf("%nAfter calling reverse(), the list contains:%n");
        output(list);

        // create a copyList from an array of three Characters
        Character[] lettersCopy = new Character[3];
        // define a new List<Character>
        List<Character> copyList = Arrays.asList(lettersCopy);

        // copy the contetns of list into copyList
        Collections.copy(copyList, list);
        System.out.printf("%nAfter copying, copyList contains:%n");
        output(copyList);

        // fill list with Rs 
        Collections.fill(list, 'R');
        System.out.printf("%nAfter calling fill, list contains:%n");
        output(list);
    }
}