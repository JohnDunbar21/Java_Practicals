public class Bicycle {
    private String size;
    private String chain;
    private int tyre_size;

    public Bicycle(String size, String chain, int tyre_size) {
        this.size = size;
        this.chain = chain;
        this.tyre_size = tyre_size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Large", "28-Speed", 10);
        System.out.println(bicycle.getSize());
    }
}
