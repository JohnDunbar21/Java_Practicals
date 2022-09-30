import java.util.Scanner;

public class Example2 {

    public static void main(String[] args) {

        double boltzmannConstant = 1.380649E-23;
        double naturalLogarithm = 2.71828;
        System.out.print("Enter the number of macroscopic states that correspond to the entropy that can be realised: ");
        Scanner input = new Scanner(System.in);
        int macroscopicStates = input.nextInt();
        System.out.println("");
        double entropy = boltzmannConstant * naturalLogarithm * macroscopicStates;
        System.out.println("The entropy of the system you have described is "+entropy+" joules per kelvin.");

    }
}
