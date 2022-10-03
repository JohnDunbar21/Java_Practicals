

public class Cars {

    // class attributes
    private String make;
    private String model;
    private int yearMade;
    private int mileage;
    private boolean isElectric;

    // class constructor that initialises the class attributes
    public Cars(String make, String model, int yearMade, int mileage, boolean isElectric) {
        this.make = make;
        this.model = model;
        this.yearMade = yearMade;
        this.mileage = mileage;
        this.isElectric = isElectric;
    }

    // getter method for the mileage attribute
    public int getMileage() {
        return this.mileage;
    }

    // setter method for the mileage attribute
    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    // getter method for the yearMade attribute
    public int getYearMade() {
        return this.yearMade;
    }

    // setter method for the yearMade attribute
    public void setYearMade(int yearMade) {
        this.yearMade = yearMade;
    }

    // getter method for the model attribute
    public String getModel() {
        return this.model;
    }

    // setter method for the model attribute
    public void setModel(String model) {
        this.model = model;
    }

    // getter method for the isElectric attribute
    public boolean getIsElectric() {
        return this.isElectric;
    }

    // setter method for the isElectric attribute
    public void setIsElectric(boolean isElectric) {
        this.isElectric = isElectric;
    }

    public static void main(String[] args) {

        Cars car1 = new Cars("Audi", "A8", 2019, 34500, false);
        Cars car2 = new Cars("Ford", "Fiesta", 2022, 12345, false);
        Cars car3 = new Cars("Tesla", "Model S", 2021, 23451, true);
        
        int mileage1 = car1.getMileage();
        System.out.println(mileage1);

        boolean isElectric = car3.getIsElectric();
        System.out.println(isElectric);
    }
}
