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
        car.setEngine("3.5LDuramaxV6DOHC");
    }

    @Override
    public void buildBreaks() {
        car.setBreaks("Four-wheeldiscbrakes:twoventilated.Electronicbrake distribution");
    }

    @Override
    public void buildSeats() {
        car.setSeats("Frontseatcenterarmrest.Rearseatcenterarmrest.Split- foldingrearseats");
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
