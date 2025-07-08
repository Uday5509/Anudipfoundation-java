public class getter {
     
    private String name;
    private int age;

    
    public String getName() {
        return name;
    }


    public void setName(String newName) {
        name = newName;
    }

    
    public int getAge() {
        return age;
    }

    
    public void setAge(int newAge) {
        if (newAge > 0) {
            age = newAge;
        }
    }
}
public class g  {
    public static void main(String[] args) {
        getter s1 = new getter();
        s1.setName("parii");
        s1.setAge(20);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}

