class Student {
    String name;
    int age;

    Student() {
        this("PARIII", 0);  
        System.out.println("Default constructor called");
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Parameterized constructor called");
    }

    void show() {
        System.out.println(name + " - " + age);
    }
}

public class cons {
    public static void main(String[] args) {
        Student s = new Student();  
        s.show();
    }
}
