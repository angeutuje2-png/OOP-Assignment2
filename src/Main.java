public class Main {
    public static void main(String[] args) {

        Driver myDriver = new Driver("D1", "John", "LIC123", 5);


        Express myBus = new Express("B1", "Express 1", 50, "Diesel", "Station", "Active", myDriver, "KB123", 100);


        myBus.startVehicle();
        System.out.println(myBus.toString());


        String id = InputValidator.getValidString("Enter ID to search: ");
        System.out.println("Searching for ID: " + id);
    }
}
