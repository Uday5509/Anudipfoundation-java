

class Animal {
    void eat() {
        System.out.println("Animal eating...");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barking...");
    }
}

class BabyDog extends Dog {
    void weep() {
        System.out.println("Baby dog weeping...");
    }
}

class multilevel {
    public static void main(String[] args) {
        BabyDog babyDog = new BabyDog();
        babyDog.weep();
        babyDog.bark();
        babyDog.eat();
    }
}