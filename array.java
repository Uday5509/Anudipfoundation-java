import java.util.Scanner;

public class array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter size of the array: ");
        int size = sc.nextInt();

        
        int[] age = new int[size];

        
        for (int i = 0; i < size; i++) {
            System.out.print("Enter age for index " + i + ": ");
            age[i] = sc.nextInt();
        }

        
        System.out.println("Ages entered:");
        for (int i = 0; i < size; i++) {
            System.out.println("age[" + i + "] = " + age[i]);
        }

        if (size > 2) {
            System.out.println("Element at index 2: " + age[2]);
        } else {
            System.out.println("Array size is too small to access index 2.");
        }
    }
}
