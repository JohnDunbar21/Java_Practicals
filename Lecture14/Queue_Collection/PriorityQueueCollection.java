/*
Taken from Dietel & Dietel textbook "Java: How to Program Early Objects".

Figure 16.14

Collection PriorityQueue.
*/
import java.util.PriorityQueue;

public class PriorityQueueCollection {

    public static void main(String[] args) {
        // default capacity is 11
        PriorityQueue<Double> queue = new PriorityQueue<>();

        // insert elements into queue
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

        System.out.print("Polling from queue: ");

        // display elements in queue
        while(queue.size() > 0) {
            System.out.printf("%.1f ", queue.peek()); // view top element
            queue.poll(); // remove top element
        }
    }
}