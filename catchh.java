
import java.util.Scanner;


public class catchh {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a and b");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c=a/b;
            System.out.println("this is output");
        } catch (Exception e) {
            System.out.println("General exception caught: " + e);
        }
    }
}

