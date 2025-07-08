class Studentt {
    String name;
    int age;
    String department;
    Studentt() {
        name = "Unknown";
        age = 20;
        department = "Unassigned";
    }
    Studentt(String name, int age) {
        this.name = name;
        this.age = age;
        department = "Computer Engineering";
    }
    Studentt(String name, int age, String department) {
        this.name = name;
        this.age = age;
        this.department = department;
    }
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Department: " + department);
        System.out.println();
    }
}
public class Student {
    public static void main(String[] args) {
        Studentt student1 = new Studentt();
        student1.displayDetails();
        Studentt student2 = new Studentt("Ritesh", 22);
        student2.displayDetails();
        Studentt student3 = new Studentt("Sarvesh", 23, "Computer Engineering");
        student3.displayDetails();
}
}