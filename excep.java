
import java.util.Scanner;

class demo{
    public void fun(){
        System.out.println("Hello");
    }
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c =a/b;
    

}
public class excep {
    public static void main(String[] args) {
        demo d = new demo();
        d.fun();
    }
}