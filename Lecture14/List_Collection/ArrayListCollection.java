/*
Taken from Dietel & Dietel textbook "Java: How to Program Early Objects".

Figure 16.2

Collection interface demonstrated via an ArrayList object.
*/
import java.util.List;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ArrayListCollection {

    private static void removeColours(Collection<String> collection1, Collection<String> collection2) {
        // define a new Iterator object
        Iterator<String> iterator = collection1.iterator();

        while(iterator.hasNext()) {
            if(collection2.contains(iterator.next())) {
                iterator.remove(); // removes the current element from the first array
            }
        }
    }

    public static void main(String[] args) {
        // define a new List implemented as an ArrayList
        List<String> list = new ArrayList<String>();

        // arbitrary String array of different colours
        String[] colours = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};

        for(String colour: colours) {
            list.add(colour); // adds the item in the colours array to the end of the list
        }

        // String array of colours to be removed from the ArrayList implementation
        String[] removeColours = {"RED", "WHITE", "BLUE"};

        // define a new List implemented as an ArrayList
        List<String> removeList = new ArrayList<String>();

        for(String colour: removeColours) {
            removeList.add(colour); // adds the item in the removeColours array to the end of the removeList
        }

        System.out.println("ArrayList: ");

        for(int i = 0; i < list.size(); i++) {
            System.out.printf("%s ", list.get(i)); // prints the element of the array at the index value of i
        }

        // use the removeColours() method to remove colours from our second ArrayList in the first ArrayList
        removeColours(list, removeList);

        System.out.printf("%n%nArrayList after calling removeColours method:%n");

        for(String colour: list) {
            System.out.printf("%s ", colour); // prints each element of the array
        }

        System.out.println();
    }
}