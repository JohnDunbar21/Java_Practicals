import java.util.Scanner;

public class Example {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer value that will set the upper-bounds of the loop: ");
        int upperLimit = input.nextInt();
        for (int i = 0; i < upperLimit; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
