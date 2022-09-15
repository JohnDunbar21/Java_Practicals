import java.util.Scanner;

public class Exercise4 {

    public static void main(String[] args) {

        Scanner milesDriven = new Scanner(System.in);
        Scanner costPerGallon = new Scanner(System.in);
        Scanner milesPerGallon = new Scanner(System.in);
        Scanner parkingFeesDaily = new Scanner(System.in);
        Scanner tollsDaily = new Scanner(System.in);

        System.out.println("Please enter the following details:");
        System.out.println("1. Total miles driven (daily)");
        System.out.println("2. Cost of fuel per gallon");
        System.out.println("3. Average miles per gallon");
        System.out.println("4. Parking fees for the day");
        System.out.println("5. Any toll fees for that day");

        double milesDaily = milesDriven.nextDouble();
        double costGallon = costPerGallon.nextDouble();
        double milesPerGall = milesPerGallon.nextDouble();
        double parkingFees = parkingFeesDaily.nextDouble();
        double tolls = tollsDaily.nextDouble();

        double dailyDrivingCost = (milesDaily * (costGallon / milesPerGall) + (parkingFees + tolls));
        System.out.println("Your total cost for driving today is: "+dailyDrivingCost);
    }
}
