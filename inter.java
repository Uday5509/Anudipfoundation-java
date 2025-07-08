public class inter{
    public static void main(String[] args) {
        dog d =new dog();
        Animal.sleep();
        d.run();
        d.makeSound();

    }
    }
interface Animal {
    void walk();
    void run();
    void makeSound();
    static void sleep() {
        System.out.println("Animal is sleeping");
    }
}

interface cat{
    void  run();
}
class dog implements  Animal,cat{
    public void walk()
    {
        System.out.println("Animal is walking");
    }
    public void run()
    {
        System.out.println("Animal is running");
    }
    public void makeSound()
    {
        System.out.println("Animal is making sound");
    }
}