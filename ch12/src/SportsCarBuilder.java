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
        car.setBreaks("Four-wheeldiscbrakes:twoventilated.Electronicbrake" +
                " distribution.StabiliTrakstabilitycontrol");
    }

    @Override
    public void buildSeats() {
        car.setSeats("Driver sportsfrontseatwithonepoweradjustmentsmanual "+
                " height,frontpassengerseatsportsfrontseatwithonepower "+
                "adjustments");
    }

    @Override
    public void buildWindows() {
        car.setWindows("Frontwindowswithone-touchontwowindows");
    }

    @Override
    public void buildFuelType() {
        car.setFuelType("Gasoline17MPGcity,28MPGhighway,20MPGcombinedand 380mi.range");
    }

    @Override
    public Car getCar() {
        return car;
    }
}
