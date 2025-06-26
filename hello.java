import java.util.*;

 public class hello {
    public static void main(String[] args )

    {
        System.out.println("enter your name");
        Scanner sc = new Scanner(System.in);
        String s =sc.nextLine();
        System.out.println("hello"+s);
        sc.close();

    }
}
