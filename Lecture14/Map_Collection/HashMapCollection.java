/*
Taken from Dietel & Dietel textbook "Java: How to Program Early Objects".

Figure 16.17

Uses the HashMap Collection to count the number of occurrences of each word in a String.
*/
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Scanner;

public class HashMapCollection {

    private static void createMap(Map<String, Integer> map) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        // tokenise the input
        String[] tokens = input.split(" ");

        for(String token: tokens) {
            String word = token.toLowerCase();

            // if the map contains the word
            if(map.containsKey(word)) {
                int count = map.get(word); // get current count
                map.put(word, count + 1); // increment count
            }
            else {
                map.put(word, 1); // add new word with a count of 1 to map
            }
        }
    }

    private static void displayMap(Map<String, Integer> map) {
        Set<String> keys = map.keySet(); // get keys

        // sort keys
        TreeSet<String> sortedKeys = new TreeSet<>(keys);

        System.out.printf("%nMap contains:%nKey\t\tValue%n");

        // generate output for each key in map
        for(String key: sortedKeys) {
            System.out.printf("%-10s%10s%n", key, map.get(key));
        }

        System.out.printf("%nsize: %d%nisEmpty: %b%n", map.size(), map.isEmpty());
    }

    public static void main(String[] args) {
        Map<String, Integer> myMap = new HashMap<>();

        createMap(myMap); // create a map based on user input
        displayMap(myMap); // display map content
    }
}