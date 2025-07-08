class Student {
    int id;
    int age;
    String name;
    static String college; 

    //static block will be created 
   static {
        college = "Dr. D.Y. Patil College";
        System.out.println(": " + college);
    }


    
    Student(int id, String name ,int age) {
        this.id = id;
        this.name = name;
        this.age = 18;
    }

    
    void display() {
        System.out.println(id + " " + name + " " + college+""+age);
    }

    
    
}


public class staticc {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Uday",18);
        Student s2 = new Student(102, "Pariii",18);
        
        s1.display();
        s2.display();
       

        
        

        
       
       
    }
}
