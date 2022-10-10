import java.util.Scanner;

public class Test1 {
    private double forceP;
    private double forceF;
    private double areaA;
    private double crossSecionalArea;

    public Test1(double forceP, double forceF, double areaA, double crossSecionalArea) {
        this.forceP = forceP;
        this.forceF = forceF;
        this.areaA = areaA;
        this.crossSecionalArea = crossSecionalArea;
    }

    public void setForceP(double force) {
        this.forceP = force;
    }

    public double getForceP() {
        return forceP;
    }

    public void setForceF(double force) {
        this.forceF = force;
    }

    public double getForceF(double force) {
        return forceF;
    }

    public void setAreaA(double area) {
        this.areaA = area;
    }

    public double getAreaA() {
        return areaA;
    }

    public void setCrossSectionalArea(double csa) {
        this.crossSecionalArea = csa;
    }

    public double getCrossSectionalArea() {
        return crossSecionalArea;
    }

    public double calculateTensileStrength() {
        return forceP / crossSecionalArea;
    }

    public double calculateTensileStress() {
        return forceF / areaA;
    }

    public static void main(String[] args) {

        System.out.println("This program can calculate the Tensile Strength or the Tensile Stress of a material.");
        System.out.println("Choose from the following options:\n1. Tensile Strength\n2. Tensile Stress");
        
        Scanner input = new Scanner(System.in);
        int userChoice = input.nextInt();


        if (userChoice == 1) {

            Test1 tensile = new Test1(0, 0, 0, 0);

            System.out.println("Enter the cross sectional area of the material being tested: ");
            double crossArea = input.nextDouble();
            tensile.setCrossSectionalArea(crossArea);

            System.out.println("Enter the force being exerted on the material: ");
            double force = input.nextDouble();
            tensile.setForceP(force);

            System.out.println("Calculating the Tensile Strength...");
            System.out.println("");
            double tensileStrength = tensile.calculateTensileStrength();
            System.out.println("The Tensile Strength of your material is: "+tensileStrength+"Nm^2.");
        } else if (userChoice == 2) {

            Test1 tensile2 = new Test1(0, 0, 0, 0);

            System.out.println("Enter the surface area of the material being tested: ");
            double surfaceArea = input.nextDouble();
            tensile2.setAreaA(surfaceArea);

            System.out.println("Enter the force required to break the material: ");
            double forceBreak = input.nextDouble();
            tensile2.setForceF(forceBreak);

            System.out.println("Calculating the Tensile Stress...");
            System.out.println("");
            double tensileStress = tensile2.calculateTensileStress();
            System.out.println("The Tensile Stress of your material is: "+tensileStress+" units.");
        } else {
            System.out.println("Invalid choice. Choose again.");
        }

    }
}
