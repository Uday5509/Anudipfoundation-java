class Vehicl {
    void start() {
        System.out.println("Vehicle started.");
    }
}
class Car extends Vehicl {
    @Override
    void start() {
        System.out.println("Car started.");
    }
}
class Motorcycle extends Vehicl {
    @Override
    void start() {
        System.out.println("Motorcycle started.");
    }
}
class Garage {
    void serviceVehicl(Vehicl vehicl) {
        vehicl.start();
        System.out.println("Vehicle serviced.");
    }
}
public class Vehicle {
    public static void main(String[] args) {
        Car car = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Garage garage = new Garage();
        garage.serviceVehicl(car);
        garage.serviceVehicl(motorcycle);}
}
