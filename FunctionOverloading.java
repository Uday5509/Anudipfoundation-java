public class FunctionOverloading {
    
    // Method with 2 integer parameters
    public static int add(int a, int b) {
        return a + b;
    }
    
    // Method with 3 integer parameters
    public static int add(int a, int b, int c) {
        return a + b + c;
    }
    
    // Method with 2 double parameters
    public static double add(double a, double b) {
        return a + b;
    }
    
    // Method with different parameter types
    public static String add(String a, String b) {
        return a + b;
    }
    
    public static void main(String[] args) {
        System.out.println("Two integers: " + add(5, 3));
        System.out.println("Three integers: " + add(5, 3, 2));
        System.out.println("Two doubles: " + add(5.5, 3.2));
        System.out.println("Two strings: " + add("Hello", " World"));
    }
}