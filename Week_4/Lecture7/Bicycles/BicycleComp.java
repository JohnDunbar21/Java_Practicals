// using composition
public class BicycleComp {
    private String size;
    private String parts;

    public BicycleComp(String size, String parts) {
        this.size = size;
        this.parts = parts;
    }

    public void setParts(String newParts) {
        this.parts = newParts;
    }

    public String getParts() {
        return parts;
    }

    public static void main(String[] args) {
        BicycleComp comp = new BicycleComp("Large", "Road bike");
        System.out.println(comp.getParts());
    }
}
