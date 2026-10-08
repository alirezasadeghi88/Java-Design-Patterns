public class SportsCarBuilder implements CarBuilder {
    private final Car car=new Car("SPORTS");

    @Override
    public void buildBodyStyle() {
        car.setBodyStyle("Externaldimensions:overalllength(inches):192.3,");
    }

    @Override
    public void buildPower() {
        car.setPower("323hp @ 6,800rpm;278ftlboftorque@4,800rpm");
    }

    @Override
    public void buildEngine() {
        car.setEngine("3.6LV6DOHCandvariablevalvetiming");
    }

    @Override
    public void buildBreaks() {
        car.setBreaks("Four-wheeldiscbrakes:twoventilated.Electronicbrake distribution.StabiliTrakstabilitycontrol");
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
