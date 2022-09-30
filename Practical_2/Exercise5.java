import java.util.Scanner;

public class Exercise5 {
    private double income;
    private double fixedExpenses;

    // class constructor
    public Exercise5(double income, double fixedExpenses) {
        this.income = income;
        this.fixedExpenses = fixedExpenses;
    }

    // getter method to retrieve the income class variable
    protected double getIncome() {
        return this.income;
    }

    // setter method to set the income class variable
    protected void setIncome(double income) {
        this.income = income;
    }

    // getter method to retrieve the fixedExpenses class variable
    protected double getFixedExpenses() {
        return this.fixedExpenses;
    }

    // setter method to set the fixedExpenses class variable
    protected void setFixedExpenses(double fixedExpenses) {
        this.fixedExpenses = fixedExpenses;
    }

    public static void main(String[] args) {
        String welcomeMessage = "You have entered the Budget Calculator!";

        Scanner userInput = new Scanner(System.in);

        
    }
}
