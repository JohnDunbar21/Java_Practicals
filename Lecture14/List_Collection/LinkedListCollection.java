/*
Taken from Dietel & Dietel textbook "Java: How to Program Early Objects".

Figure 16.4

Collection interface demonstrated via an LinkedList object.
*/
import java.util.LinkedList;
import java.util.Arrays;

public class LinkedListCollection {

    public static void main(String[] args) {
        // arbitrary String array of different colours
        String[] colours = {"MAGENTA", "RED", "WHITE", "BLUE", "CYAN"};

        // define a new LinkedList object implemented as a LinkedList
        LinkedList<String> links = new LinkedList<>(Arrays.asList(colours));

        links.addLast("RED"); // adds the colour RED to the end of the LinkedList
        links.add("PINK"); // adds the colour PINK to the end of the LinkedList
        links.add(3, "GREEN"); // adds the colour GREEN at the third index of the LinkedList
        links.addFirst("CYAN"); // adds the colour CYAN to the start of the LinkedList

        // retrieve the elements stored in the LinkedList and store them in the colours variable as a String array
        colours = links.toArray(new String[links.size()]);

        System.out.println("Colours: ");

        for(String colour: colours) {
            System.out.println(colour); // print the colour to the terminal
        }
    }
}