public abstract class Vehicle {
    private String vehicleID, vehicleName, fuelType, currentLocation, status;
    private int capacity;

    public Vehicle() {}

    public Vehicle(String vehicleID, String vehicleName, int capacity, String fuelType, String currentLocation, String status) {
        this.vehicleID = vehicleID;
        this.vehicleName = vehicleName;
        this.capacity = capacity;
        this.fuelType = fuelType;
        this.currentLocation = currentLocation;
        this.status = status;
    }
    public String getVehicleID() { return vehicleID; }
    public int getCapacity() { return capacity; }

    @Override
    public String toString() {
        return "ID: " + vehicleID + " | Name: " + vehicleName + " | Capacity: " + capacity;
    }
    public abstract void startVehicle();
    public abstract void stopVehicle();
    public abstract double calculateFuelConsumption();
    public abstract boolean checkAvailability();
    public abstract void assignRoute(String route);
    public abstract void updateLocation(String location);
    public abstract void performMaintenanceCheck();
    public abstract String generateVehicleReport();

}
