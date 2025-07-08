import java.io.*;

public class FileGenerator {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello World!\nThis is a generated file.\nJava File Generation Example.");
            writer.close();
            System.out.println("File generated successfully!");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}