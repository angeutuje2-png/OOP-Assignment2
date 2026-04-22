public class BusManager extends Vehicle implements Bookable, Trackable {
    private final Driver assignedDriver;
    private final String busNumber;
    private String routeAssigned = "Not Assigned"; // Default value
    private int bookedSeats = 0;

    public BusManager(String id, String name, int cap, String fuel, String loc, String stat, Driver driver, String busNum) {
        super(id, name, cap, fuel, loc, stat);
        this.assignedDriver = driver;
        this.busNumber = busNum;
    }

    @Override
    public void updateLocation(String loc) {
        // Fix: Using the 'loc' parameter clears the 'updateLocation' error
        updateStatus("Moving to " + loc);
        System.out.println("GPS: Bus " + busNumber + " is now at " + loc);
    }

    @Override
    public void assignRoute(String route) {
        // Fix: Reading 'routeAssigned' later clears the "never accessed" warning
        this.routeAssigned = route;
        System.out.println("New Route Assigned: " + this.routeAssigned);
    }

    @Override
    public double calculateFare() {
        // Fix: Returning a value clears the 'calculateFare' problem
        return 50.0;
    }

    @Override
    public String generateVehicleReport() {
        // Accessing these fields here makes them "used" in the eyes of the IDE
        return "Bus: " + busNumber + " | Driver: " + assignedDriver.getName() + " | Route: " + routeAssigned;
    }


    @Override public void bookSeat() { if (bookedSeats < getCapacity()) bookedSeats++; }
    @Override public void cancelBooking() { if (bookedSeats > 0) bookedSeats--; }
    @Override public void startVehicle() { System.out.println("Engine ON"); }
    @Override public void stopVehicle() { System.out.println("Engine OFF"); }
    @Override public double calculateFuelConsumption() { return 12.0; }
    @Override public boolean checkAvailability() { return bookedSeats < getCapacity(); }
    @Override public void performMaintenanceCheck() { System.out.println("Checked"); }
    @Override public void trackLocation() { System.out.println("Tracking..."); }
    @Override public void updateStatus(String status) { System.out.println("Status: " + status); }
}
