class BusFactory {

    public static BusManager createBus(String type, String id, String name, int cap, Driver driver, String busNum) {
        if (type.equalsIgnoreCase("Luxury")) {

            return new LuxuryBus(id, name, cap, "Diesel", "Depot", "Active", driver, busNum, true);
        }

        return new BusManager(id, name, cap, "Diesel", "Depot", "Active", driver, busNum);
    }
}
