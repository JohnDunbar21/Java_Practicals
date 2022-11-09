import java.util.UUID;

public abstract class Car implements CarDetails {

    private UUID productId;

    abstract void printProductId();
}