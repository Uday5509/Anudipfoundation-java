public class stringoperation {
    public static void main(String[] args) {
        String str = "Java Programming";

        System.out.println("Length: " + str.length());
        System.out.println("First Character: " + str.charAt(5));
        System.out.println("Uppercase: " + str.toUpperCase());
        System.out.println("Substring: " + str.substring(5));
        System.out.println("Contains 'Program': " + str.contains("Program"));
    }
}
