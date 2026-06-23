public class TestBridgePattern {
    public static void main(String[] args) {

        Product product = new CentralLocking("Central Locking System");
        Product product1 = new GearLocking("Gear Locking System");
        Car car = new BigWheel(product,"BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new BigWheel(product1, "BigWheel xz model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        car = new Motoren(product, "Motoren lm model");
        car.produceProduct();
        car.assemble();
        car.printDetails();

        System.out.println();

        car = new Motoren(product1, "Motoren lm model");
    }
}
