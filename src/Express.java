
public class Express extends BusManager {

    private final int speedLimit;

    public Express(String id, String name, int cap, String fuel, String loc, String stat, Driver driver, String busNum, int speedLimit) {

        super(id, name, cap, fuel, loc, stat, driver, busNum);
        this.speedLimit = speedLimit;
    }

    @Override
    public void startVehicle() {
        System.out.println("Express Bus " + getVehicleID() + " is warming up for high-speed travel.");
    }

    @Override
    public double calculateFare() {
        return 75.0;
    }

    @Override
    public double calculateFuelConsumption() {
        return 20.5;
    }

    @Override
    public String toString() {
        return super.toString() + " | Type: Express | Speed Limit: " + speedLimit + " km/h";
    }
}
