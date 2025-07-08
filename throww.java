public class throww {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote"); // manual throw
        } else {
            System.out.println("You can vote");
        }
    }

    public static void main(String[] args) {
        checkAge(16);  
    }
}
