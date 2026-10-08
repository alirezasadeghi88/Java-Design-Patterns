public class SedanCarBuilder implements CarBuilder {
    private final Car car=new Car("SEDAN");

    @Override
    public void buildBodyStyle() {
        car.setBodyStyle("Externaldimensions:overalllength(inches):202.9,");
    }

    @Override
    public void buildPower() {
        car.setPower("285hp @ 6,500rpm;253ftlboftorque@4,000rpm");
    }

    @Override
    public void buildEngine() {

    }

    @Override
    public void buildBreaks() {

    }

    @Override
    public void buildSeats() {

    }

    @Override
    public void buildWindows() {

    }

    @Override
    public void buildFuelType() {

    }

    @Override
    public Car getCar() {
        return null;
    }
}
