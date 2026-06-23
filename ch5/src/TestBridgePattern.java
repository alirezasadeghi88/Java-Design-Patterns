public class TestBridgePattern {
    public static void main(String[] args) {

        Product product = new CentralLocking("CentralLockingSystem");
        Product product1 = new GearLocking("GearLockingSystem");

    }
}
