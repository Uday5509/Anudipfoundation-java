import java.util.Scanner;

public class palindrone {
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        int rev = 0;

        while(num > 0) {
            rev = rev * 10 + num % 10;
            num = num / 10;
        }

        System.out.println("Reverse number: "+ rev);
    }
}
