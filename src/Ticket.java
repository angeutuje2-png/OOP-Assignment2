public class Ticket {

    private final String ticketId;
    private final Passenger passenger;
    private final BusManager bus; // Changed from Manager to BusManager
    private final int seatNumber;
    private final double price;

    public Ticket(String ticketId, Passenger passenger, BusManager bus, int seatNumber) {
        this.ticketId = ticketId;
        this.passenger = passenger;
        this.bus = bus;
        this.seatNumber = seatNumber;

        this.price = calculateTicketPrice();
    }

    public double calculateTicketPrice() {

        return bus.calculateFare() + 5.0; // Base fare + booking fee
    }

    @Override
    public String toString() {
        return "Ticket ID: " + ticketId + " | Passenger: " + passenger.getName() +
                " | Bus: " + bus.generateVehicleReport() + " | Price: $" + price;
    }


    public String getTicketId() { return ticketId; }
    public double getPrice() { return price; }
    public Passenger getPassenger() { return passenger; }
    public BusManager getBus() { return bus; }
}
