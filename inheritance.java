

class Animal {
    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Some generic animal sound");
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Dog extends Animal {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

// Derived class Cat inheriting from Animal 
class Cat extends Animal {
    private boolean isIndoor;

    public Cat(String name, int age, boolean isIndoor) {
        super(name, age);
        this.isIndoor = isIndoor;
    }

    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Indoor Cat: " + isIndoor);
    }
}

class inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", 3, "German Shepherd");
        Cat cat = new Cat("Luna", 2, true);

        System.out.println("Dog Info:");
        dog.displayInfo();
        dog.makeSound();

        System.out.println("\nCat Info:");
        cat.displayInfo();
        cat.makeSound();
    }
}