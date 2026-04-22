
public class CityBus extends BusManager {

    private final int numberOfStops;

    public CityBus(String id, String name, int cap, String fuel, String loc, String stat, Driver driver, String busNum, int stops) {

        super(id, name, cap, fuel, loc, stat, driver, busNum);
        this.numberOfStops = stops;
    }


    @Override
    public double calculateFare() {
        return 20.0; // City buses have a flat low fare
    }

    @Override
    public void updateLocation(String loc) {
        System.out.println("City Bus is at stop: " + loc);
    }

    @Override
    public String toString() {

        return super.toString() + " | Type: City Bus | Stops: " + numberOfStops;
    }
}
