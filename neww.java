class Student {
    String name;

    Student(String n) {
        name = n;
    }

    void display() {
        System.out.println("Name: " + name);
    }
}

public class neww {
    public static void main(String[] args) {
        Student s1 = new Student("Uday Ahireee"); 
        s1.display(); 
    }
}
