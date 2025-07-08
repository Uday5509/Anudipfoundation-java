import java.util.*;

public class BusReservationSystem {
    private ArrayList<Bus> buses = new ArrayList<>();
    private ArrayList<Reservation> reservations = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int nextReservationId = 1;
    
    public void addBus() {
        System.out.print("Enter Bus ID: ");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Bus Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Source: ");
        String source = sc.nextLine();
        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();
        System.out.print("Enter Total Seats: ");
        int seats = sc.nextInt();
        System.out.print("Enter Fare: ");
        double fare = sc.nextDouble();
        
        buses.add(new Bus(id, name, source, destination, seats, fare));
        System.out.println("Bus added successfully!");
    }
    
    public void viewBuses() {
        if (buses.isEmpty()) {
            System.out.println("No buses available.");
            return;
        }
        System.out.println("\n--- Available Buses ---");
        for (Bus bus : buses) {
            bus.displayBus();
        }
    }
    
    public void bookTicket() {
        viewBuses();
        if (buses.isEmpty()) return;
        
        System.out.print("Enter Bus ID to book: ");
        int busId = sc.nextInt();
        sc.nextLine();
        
        Bus selectedBus = null;
        for (Bus bus : buses) {
            if (bus.busId == busId) {
                selectedBus = bus;
                break;
            }
        }
        
        if (selectedBus == null) {
            System.out.println("Bus not found!");
            return;
        }
        
        System.out.print("Enter Passenger Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Number of Seats: ");
        int seats = sc.nextInt();
        
        if (seats > selectedBus.availableSeats) {
            System.out.println("Not enough seats available!");
            return;
        }
        
        double amount = seats * selectedBus.fare;
        reservations.add(new Reservation(nextReservationId++, busId, name, seats, amount));
        selectedBus.availableSeats -= seats;
        
        System.out.println("Ticket booked successfully! Total Amount: $" + amount);
    }
    
    public void viewReservations() {
        if (reservations.isEmpty()) {
            System.out.println("No reservations found.");
            return;
        }
        System.out.println("\n--- All Reservations ---");
        for (Reservation res : reservations) {
            res.displayReservation();
        }
    }
    
    public void cancelReservation() {
        viewReservations();
        if (reservations.isEmpty()) return;
        
        System.out.print("Enter Reservation ID to cancel: ");
        int resId = sc.nextInt();
        
        Reservation toCancel = null;
        for (Reservation res : reservations) {
            if (res.reservationId == resId) {
                toCancel = res;
                break;
            }
        }
        
        if (toCancel == null) {
            System.out.println("Reservation not found!");
            return;
        }
        
        // Restore seats
        for (Bus bus : buses) {
            if (bus.busId == toCancel.busId) {
                bus.availableSeats += toCancel.seatsBooked;
                break;
            }
        }
        
        reservations.remove(toCancel);
        System.out.println("Reservation cancelled successfully!");
    }
    
    public void showMenu() {
        while (true) {
            System.out.println("\n=== Bus Reservation System ===");
            System.out.println("1. Add Bus");
            System.out.println("2. View Buses");
            System.out.println("3. Book Ticket");
            System.out.println("4. View Reservations");
            System.out.println("5. Cancel Reservation");
            System.out.println("6. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1: addBus(); break;
                case 2: viewBuses(); break;
                case 3: bookTicket(); break;
                case 4: viewReservations(); break;
                case 5: cancelReservation(); break;
                case 6: System.out.println("Thank you!"); return;
                default: System.out.println("Invalid option!");
            }
        }
    }
    
    public static void main(String[] args) {
        BusReservationSystem system = new BusReservationSystem();
        system.showMenu();
    }
}