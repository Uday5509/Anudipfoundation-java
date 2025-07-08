public class Bus {
    int busId;
    String busName;
    String source;
    String destination;
    int totalSeats;
    int availableSeats;
    double fare;
    
    public Bus(int busId, String busName, String source, String destination, int totalSeats, double fare) {
        this.busId = busId;
        this.busName = busName;
        this.source = source;
        this.destination = destination;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.fare = fare;
    }
    
    public void displayBus() {
        System.out.println("Bus ID: " + busId + " | Name: " + busName + " | " + source + " -> " + destination + 
                          " | Available: " + availableSeats + "/" + totalSeats + " | Fare: $" + fare);
    }
}