interface Animal {
    void eat();
    void makeSound();
}

class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating chicken.");
    }

    public void makeSound() {
        System.out.println("Dogesh.");
    }
}

public class interf{
    public static void main(String[] args) {
        Dog d = new Dog();
        d.eat();
        d.makeSound();
    }
}
