
import java.util.Scanner;


public class Product {

    String name;
    int  price;

    
    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Product() {
    }

    
    public void showDetails() {
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }

    
    

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
    
        Product p = new Product("Samsung", 15000);
        
        p.showDetails();

        
    }
}
