public class SportsCarBuilder implements CarBuilder {
    private final Car car=new Car("SPORTS");

    @Override
    public void buildBodyStyle() {
        car.setBodyStyle("Externaldimensions:overalllength(inches):192.3,");
    }

    @Override
    public void buildPower() {

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
