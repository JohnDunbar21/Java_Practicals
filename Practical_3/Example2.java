import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        int counter = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer value for the upper bound of the loop: ");
        int upperBound = input.nextInt();
        for (int i = 0; i < upperBound; i++) {
            if (counter % 5 == 0) {
                if (i * 3 <= 100) {
                    System.out.println(i*3);
                } else {
                    System.out.println(i);
                }
            } else {
                System.out.println(i);
            }
            counter++;
        }
    }
}