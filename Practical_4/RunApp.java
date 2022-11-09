import java.util.Scanner;

public class RunApp {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);
        
        System.out.println("Exit? (type 'exit': ");
        String exit = userInput.next();
        System.out.println("Enter your first integer value: ");
        int number1 = userInput.nextInt();
        System.out.println("Enter your the operation you want to perform (+, -, *): ");
        String operator = userInput.next();
        System.out.println("Enter your second integer value: ");
        int number2 = userInput.nextInt();

            Calculator calculate = new Calculator();
        while (exit != "exit") {
            if (operator == "+") {
                System.out.printf("The addition of %d and %d is: %d", number1, number2, calculate.add(number1, number2));
            } else if (operator == "-") {
                System.out.printf("The difference of %d and %d is: %d", number1, number2, calculate.subtract(number1, number2));
            } else if (operator == "*") {
                System.out.printf("The multiplication of %d and %d is: %d", number1, number2, calculate.multiply(number1, number2));
            } else if (exit == "exit") {
                System.out.println("Exiting program...");
                break;
            } else {
                System.out.println("Invalid input, try again...");
            }
        }
    }
}