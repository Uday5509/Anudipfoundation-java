
public abstract class abstracts {
    protected String color;
    protected double area;

    
    public abstracts(String color) {
        this.color = color;
    }


    public abstract double calculateArea();

    
    public abstract void draw();

    
    public String getColor() {
        return color;
    }
}


public abstract class  Animal {
    protected String name;
    protected int age;

    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    
    public abstract void makeSound();
    public abstract void move();


    public String getName() {
        return name;
    }
}


public abstract class Vehicle {
    protected String brand;
    protected String model;
    protected int year;

    
    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    
    public abstract void startEngine();
    public abstract void stopEngine();
    public abstract double calculateFuelEfficiency();

    
    public String getVehicleInfo() {
        return year + " " + brand + " " + model;
    }
}