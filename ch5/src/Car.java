public abstract class Car {
    private final Product product;
    private final String carType;

    protected Car(Product product, String carType) {
        this.product = product;
        this.carType = carType;
    }
}
