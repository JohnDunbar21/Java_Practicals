import java.util.Scanner;

public class Test1 {
    private double forceP;
    private double forceF;
    private double areaA;
    private double crossSecionalArea;

    public static void setForceP(double force) {
        this.forceP = force;
    }

    public static double getForceP() {
        return this.forceP;
    }

    public static void setForceF(double force) {
        this.forceF = force;
    }

    public static double getForceF(double force) {
        return this.forceF;
    }

    public static void setAreaA(double area) {
        this.areaA = area;
    }

    public static double getAreaA() {
        return this.areaA;
    }

    public static void setCrossSectionalArea(double csa) {
        this.crossSecionalArea = csa;
    }

    public static double getCrossSectionalArea() {
        return this.crossSecionalArea;
    }

    public static double calculateTensileStrength() {
        return this.forceP / this.crossSecionalArea;
    }

    public static double calculateTensileStress() {
        return this.forceF / this.areaA;
    }

    public static void main(String[] args) {

        System.out.println("This program can calculate the Tensile Strength or the Tensile Stress of a material.");
        System.out.println("Choose from the following options:\n1. Tensile Strength\n2. Tensile Stress");
        
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();

        if (userChoice == 1) {
            System.out.println("Enter the cross sectional area of the material being tested: ");
            double crossArea = input.nextDouble();
            setCrossSectionalArea(crossArea);

            System.out.println("Enter the force being exerted on the material: ");
            double force = input.nextDouble();
            setForceP(force);

            System.out.println("Calculating the Tensile Strength...");
            System.out.println("");
            double tensileStrength = calculateTensileStrength();
            System.out.println("The Tensile Strength of your material is: "+tensileStrength+"Nm^2.");
        } else if (userChoice == 2) {
            System.out.println("Enter the surface area of the material being tested: ");
            double surfaceArea = input.nextDouble();
            setAreaA(surfaceArea);

            System.out.println("Enter the force required to break the material: ");
            double forceBreak = input.nextDouble();
            setForceP(forceBreak);

            System.out.println("Calculating the Tensile Stress...");
            System.out.println("");
            double tensileStress = calculateTensileStress();
            System.out.println("The Tensile Stress of your material is: "+tensileStress+" units.");
        } else {
            System.out.println("Invalid choice. Choose again.");
        }

    }
}
