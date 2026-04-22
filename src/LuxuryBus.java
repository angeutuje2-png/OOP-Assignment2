public class LuxuryBus extends BusManager {
    private boolean hasWiFi;

    public LuxuryBus(String id, String name, int cap, String fuel, String loc, String stat, Driver driver, String busNum, boolean hasWiFi) {
        super(id, name, cap, fuel, loc, stat, driver, busNum);
        this.hasWiFi = hasWiFi;
    }

    @Override
    public double calculateFare() {
        return super.calculateFare() * 2.5; // Luxury is more expensive
    }

    @Override
    public String toString() {
        return super.toString() + " | Luxury Features: [WiFi: " + (hasWiFi ? "Yes" : "No") + "]";
    }
}
