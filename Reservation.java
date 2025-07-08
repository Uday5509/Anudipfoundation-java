public class Reservation {
    int reservationId;
    int busId;
    String passengerName;
    int seatsBooked;
    double totalAmount;
    
    public Reservation(int reservationId, int busId, String passengerName, int seatsBooked, double totalAmount) {
        this.reservationId = reservationId;
        this.busId = busId;
        this.passengerName = passengerName;
        this.seatsBooked = seatsBooked;
        this.totalAmount = totalAmount;
    }
    
    public void displayReservation() {
        System.out.println("Reservation ID: " + reservationId + " | Bus ID: " + busId + 
                          " | Passenger: " + passengerName + " | Seats: " + seatsBooked + 
                          " | Amount: $" + totalAmount);
    }
}